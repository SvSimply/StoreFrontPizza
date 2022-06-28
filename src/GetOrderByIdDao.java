import Exceptions.OrderNotFoundException;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dynamodb.Order;

public class GetOrderByIdDao {
    private final DynamoDBMapper dynamoDbMapper;


    public GetOrderByIdDao(DynamoDBMapper dynamoDbMapper) {
        this.dynamoDbMapper = dynamoDbMapper;
    }


    public Order getOrderById(String orderId) throws OrderNotFoundException {
        Order order = this.dynamoDbMapper.load(Order.class, orderId);

        if (order == null) {
            throw new OrderNotFoundException("Could not find order with id " + orderId);
        }

        return order;
    }
}