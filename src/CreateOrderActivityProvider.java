import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import javax.management.InvalidAttributeValueException;

public class CreateOrderActivityProvider implements RequestHandler<CreateOrderRequest, CreateOrderResult> {

    private static App app;

    private App getApp() {
        if (app == null) {
            app = new App();
        }

        return app;
    }

    @Override
    public CreateOrderResult handleRequest(CreateOrderRequest createOrderRequest, Context context) {
        try {
            return getApp().provideCreateOrderActivity().handleRequest(createOrderRequest, context) ;
        } catch (InvalidAttributeValueException e) {
            throw new RuntimeException("[BadRequest] Invalid characters in name or customer field.");
        }
//        return null;
    }
}
