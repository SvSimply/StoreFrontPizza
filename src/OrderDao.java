import Exceptions.OrderNotFoundException;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dynamodb.Order;

public class OrderDao {
    private final DynamoDBMapper dynamoDbMapper;

    public OrderDao(DynamoDBMapper dynamoDbMapper) {
        this.dynamoDbMapper = dynamoDbMapper;
    }

    public Order getOrder(String orderId) throws OrderNotFoundException {
        Order order = this.dynamoDbMapper.load(Order.class, orderId);

        if (order == null) {
            throw new OrderNotFoundException("Could not find order with id " + orderId);
        }

        return order;
    }

    public Order saveOrder(Order newOrder) {
        dynamoDbMapper.save(newOrder);
        return newOrder;
    }
}



