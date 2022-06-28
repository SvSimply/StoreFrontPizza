import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GetOrderByIdActivityProvider implements RequestHandler<GetOrderByIdRequest, GetOrderByIdResult> {

    private static App app;

    public GetOrderByIdActivityProvider() {

    }

//    @Override
//    public GetOrderByIdResult handleRequest(final GetPlaylistRequest getPlaylistRequest, Context context) {
//        return getApp().provideGetPlaylistActivity().handleRequest(getPlaylistRequest, context);
//    }

    private App getApp() {
        if (app == null) {
            app = new App();
        }

        return app;
    }

    @Override
    public GetOrderByIdResult handleRequest(GetOrderByIdRequest getOrderByIdRequest, Context context) {
        return getApp().provideGetOrderByIdActivity().handleRequest(getOrderByIdRequest, context);
    }
}