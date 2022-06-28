import Exceptions.MenuNotFoundException;

import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import com.amazonaws.services.lambda.runtime.Context;
import dynamodb.MenuDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetMenuActivity {

    private final Logger log = LogManager.getLogger();

    private final MenuDao menuDao;

    public GetMenuActivity(MenuDao menuDao){this.menuDao = menuDao;}

    public GetMenuResult handleRequest(final GetMenuRequest getMenuRequest, Context context) throws MenuNotFoundException {
        log.info("Received GetPlaylistRequest {}", getMenuRequest);
//        String requestedId = getMenuRequest.getItemId();
        PaginatedScanList<MenuDB> menu = menuDao.getMenu();
        return GetMenuResult.builder()
                .withMenu(menu)
                .build();
    }
}
