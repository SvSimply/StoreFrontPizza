import Exceptions.OrderNotFoundException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class UpdateOrderActivityProvider implements RequestHandler<UpdateOrderRequest, UpdateOrderResult> {

    private static App app;

    public UpdateOrderActivityProvider() {
    }

    private App getApp() {
        if (app == null) {
            app = new App();
        }

        return app;
    }

    @Override
    public UpdateOrderResult handleRequest(UpdateOrderRequest updateOrderRequest, Context context) {
        try {
            return getApp().provideUpdateOrdersActivity().handleRequest(updateOrderRequest, context) ;
        } catch (OrderNotFoundException e) {
            throw new RuntimeException("[BadRequest] Invalid Order Id.");
        }
    }
}
