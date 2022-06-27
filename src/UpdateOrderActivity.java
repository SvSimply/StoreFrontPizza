import Exceptions.OrderNotFoundException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dynamodb.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UpdateOrderActivity implements RequestHandler<UpdateOrderRequest, UpdateOrderResult> {
    private final Logger log = LogManager.getLogger();
    private final UpdateOrderDao updateOrderDao;

    public UpdateOrderActivity(UpdateOrderDao updateOrderDao) {
        this.updateOrderDao = updateOrderDao;
    }

    @Override
    public UpdateOrderResult handleRequest(final UpdateOrderRequest updateOrderRequest, Context context) {
        log.info("Received UpdateOrderRequest {}", updateOrderRequest);
        String requestedId = updateOrderRequest.getOrderId();

        Order order = null;
        try {
            order = updateOrderDao.getOrder(requestedId);

        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }
        order.setStatus(updateOrderRequest.getStatus());
        updateOrderDao.saveOrder(order);
            return UpdateOrderResult.builder().withOrder(order)
                    .build();
        }
}