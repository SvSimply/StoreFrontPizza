import Exceptions.OrderNotFoundException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dynamodb.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UpdateOrderActivity implements RequestHandler<UpdateOrderRequest, UpdateOrderResult> {
    private final Logger log = LogManager.getLogger();
    private final OrderDao orderDao;

    public UpdateOrderActivity(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public UpdateOrderResult handleRequest(final UpdateOrderRequest updateOrderRequest, Context context) {
        log.info("Received UpdateOrderRequest {}", updateOrderRequest);
        String requestedId = updateOrderRequest.getOrderId();

        Order order = null;
        try {
            order = orderDao.getOrder(requestedId);

        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);

        order.setStatus(updateOrderRequest.getStatus());
        order.setUpdateDate(strDate);
        orderDao.saveOrder(order);
        return UpdateOrderResult.builder()
                .withOrder(order)
                .build();
        }
}
