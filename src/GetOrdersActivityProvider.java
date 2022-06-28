import Exceptions.OrderNotFoundException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GetOrdersActivityProvider implements RequestHandler<GetOrdersRequest, GetOrdersResult> {

    private static App app;

    private App getApp() {
        if (app == null) {
            app = new App();
        }

        return app;
    }

    @Override
    public GetOrdersResult handleRequest(final GetOrdersRequest getOrdersRequest, Context context){
//        AmazonDynamoDBClientBuilder a = AmazonDynamoDBClientBuilder.standard();
//        a.setRegion(Regions.US_WEST_2.getName());
//        DynamoDBMapper mapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient(Regions.US_WEST_2));
//        GetOrdersDao ordersDao = new GetOrdersDao(mapper);
//        GetOrdersActivity ordersActivity = new GetOrdersActivity(ordersDao);

        try {
            return getApp().provideGetOrdersActivity().handleRequest(getOrdersRequest, context);
        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }



        return null;
    }
}
