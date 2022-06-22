import com.amazon.ata.aws.dynamodb.DynamoDbClientProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GetMenuActivityProvider implements RequestHandler<GetMenuRequest, GetMenuResult> {
    @Override
    public GetMenuResult handleRequest(final GetMenuRequest getMenuRequest, Context context) {
//        AmazonDynamoDBClientBuilder a = AmazonDynamoDBClientBuilder.standard();
//        a.setRegion(Regions.US_WEST_2.getName());
        DynamoDBMapper mapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient(Regions.US_WEST_2));
        MenuDao menuDao = new MenuDao(mapper);
        Menu menuActivity = new Menu(menuDao);

        try {
            return menuActivity.handleRequest(getMenuRequest);
        } catch (MenuDao.MenuNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
