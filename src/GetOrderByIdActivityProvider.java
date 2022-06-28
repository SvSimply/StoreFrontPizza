import Exceptions.OrderNotFoundException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GetOrderByIdActivityProvider implements RequestHandler<GetOrderByIdRequest, GetOrderByIdResult> {

    private static App app;

    public GetOrderByIdActivityProvider() {

    }

    private App getApp() {
        if (app == null) {
            app = new App();
        }

        return app;
    }

    @Override
    public GetOrderByIdResult handleRequest(GetOrderByIdRequest getOrderByIdRequest, Context context) {
        try {
            return getApp().provideGetOrderByIdActivity().handleRequest(getOrderByIdRequest, context);
        } catch (OrderNotFoundException e) {
            throw new RuntimeException("[BadRequest] Invalid Order Id.");
        }
    }
}