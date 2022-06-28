import Exceptions.MenuNotFoundException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GetMenuActivityProvider implements RequestHandler<GetMenuRequest, GetMenuResult> {


    private static App app;

    private App getApp() {
        if (app == null) {
            app = new App();
        }

        return app;
    }

    @Override
    public GetMenuResult handleRequest(final GetMenuRequest getMenuRequest, Context context) {
//        AmazonDynamoDBClientBuilder a = AmazonDynamoDBClientBuilder.standard();
//        a.setRegion(Regions.US_WEST_2.getName());
//        DynamoDBMapper mapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient(Regions.US_WEST_2));
//        MenuDao menuDao = new MenuDao(mapper);
//        Menu menuActivity = new Menu(menuDao);

        try {
            return getApp().provideGetMenuActivity().handleRequest(getMenuRequest, context);
        } catch (MenuNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
