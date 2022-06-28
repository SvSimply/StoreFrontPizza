import Exceptions.OrderNotFoundException;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import dynamodb.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetOrdersDao {

        private final DynamoDBMapper dynamoDbMapper;
        private final Logger log = LogManager.getLogger();

        public GetOrdersDao(DynamoDBMapper dynamoDbMapper) {
            this.dynamoDbMapper = dynamoDbMapper;

        }

        public PaginatedScanList<Order> getActiveOrders() throws OrderNotFoundException {
            log.fatal("Received item Id {}", "active orders");
//        MenuDB menu = this.dynamoDbMapper.load(MenuDB.class, itemId, "Margherita Pizza");
            PaginatedScanList<Order> ordersList = this.dynamoDbMapper.scan(Order.class, new DynamoDBScanExpression());

            if (ordersList == null) {
                throw new OrderNotFoundException("Cannot find the correct order" + null);
            }

            return ordersList;
        }



}
