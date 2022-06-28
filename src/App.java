import com.amazon.ata.aws.dynamodb.DynamoDbClientProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class App {
    private DynamoDBMapper dynamoDBMapper;

    private DynamoDBMapper provideDynamoDBMapper() {
        if (null == dynamoDBMapper) {
            dynamoDBMapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient(Regions.US_WEST_2));
        }
        return dynamoDBMapper;
    }
    private GetOrdersDao provideOrdersDao() {
        return new GetOrdersDao(provideDynamoDBMapper());
    }
    private MenuDao provideMenuDao() {
        return new MenuDao(provideDynamoDBMapper());
    }

    private OrderDao provideOrderDao() {
        return new OrderDao(provideDynamoDBMapper());
    }

    private GetOrderByIdDao provideGetOrderByIdDao(){
        return new GetOrderByIdDao(provideDynamoDBMapper());
    }


//    private GetIngredients provideGetIngredients() {
//        return new GetIngredients(provideDynamoDBMapper());
//    }
    public GetOrdersActivity provideGetOrdersActivity() {
        return new GetOrdersActivity(provideOrdersDao());
}

    public GetMenuActivity provideGetMenuActivity() {
        return new GetMenuActivity(provideMenuDao());
    }

    public UpdateOrderActivity provideUpdateOrdersActivity() {
        return new UpdateOrderActivity(provideOrderDao());
    }

    public CreateOrderActivity provideCreateOrderActivity() {
        return new CreateOrderActivity(provideOrderDao());
    }

    public GetOrderByIdActivity provideGetOrderByIdActivity() {
        return new GetOrderByIdActivity(provideOrderDao());
    }



}
