import Exceptions.OrderNotFoundException;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import com.amazonaws.services.lambda.runtime.Context;
import dynamodb.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetOrdersActivity {

    private final Logger log = LogManager.getLogger();

    private final GetOrdersDao getOrdersDao;

    public GetOrdersActivity(GetOrdersDao ordersDao){this.getOrdersDao = ordersDao;}

    public GetOrdersResult handleRequest(final GetOrdersRequest getOrdersRequest, Context context) throws OrderNotFoundException {
        log.info("Received GetActiveOrdersRequest {}", getOrdersRequest);
//        String requestedId = getMenuRequest.getItemId();
        PaginatedScanList<Order> orders = getOrdersDao.getActiveOrders();
        return GetOrdersResult.builder()
                .withOrder(orders)
                .build();
    }
}
