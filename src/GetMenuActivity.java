import Exceptions.MenuNotFoundException;
import dynamodb.MenuDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import javax.naming.Context;

public class GetMenuActivity implements RequestHandler<GetOrderRequest, GetOrderResult> {

    private final Logger log = LogManager.getLogger();

    private final MenuDao menuDao;

    public GetMenuActivity(MenuDao menuDao) {
        this.menuDao = menuDao;
    }


    public GetOrderResult handleRequest(final GetOrderRequest getOrderRequest, Context context) throws MenuNotFoundException {

        log.info("Received GetOrderRequest {}", getOrderRequest);
        String requestedItemId = getOrderRequest.getItemId();
        try {
            MenuDB menu = menuDao.getMenu().get(0);
            MenuModel menuModel = new ModelConverter().toMenuModel(menu);

            return GetOrderResult.builder()
                    .withMenu(menuModel)
                    .build();
        } catch (MenuNotFoundException e) {
            return null;
        }
    }

    @Override
    public GetOrderResult handleRequest(GetOrderRequest input, com.amazonaws.services.lambda.runtime.Context context) {
        return null;
    }
}
