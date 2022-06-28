import Exceptions.OrderNotFoundException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dynamodb.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetOrderByIdActivity  {
    private final Logger log = LogManager.getLogger();
    private final OrderDao OrderDao;


    public GetOrderByIdActivity(OrderDao OrderDao) {
        this.OrderDao = OrderDao;
    }


    public GetOrderByIdResult handleRequest(GetOrderByIdRequest getOrderByIdRequest, Context context) throws OrderNotFoundException{
        String requestedId = getOrderByIdRequest.getOrderId();
        Order order = OrderDao.getOrder(requestedId);
        return GetOrderByIdResult.builder().withOrder(order).build();
    }
}
