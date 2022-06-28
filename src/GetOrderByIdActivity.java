import Exceptions.OrderNotFoundException;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dynamodb.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetOrderByIdActivity implements RequestHandler<GetOrderByIdRequest, GetOrderByIdResult> {
    private final Logger log = LogManager.getLogger();
    private final OrderDao OrderDao;


    public GetOrderByIdActivity(OrderDao OrderDao) {
        this.OrderDao = OrderDao;
    }


//    @Override
//    public GetOrderByIdResult handleRequest(final GetPlaylistRequest getPlaylistRequest, Context context) {
//        log.info("Received GetPlaylistRequest {}", getPlaylistRequest);
//        String requestedId = getPlaylistRequest.getId();
//        Playlist playlist = playlistDao.getPlaylist(requestedId);
//        PlaylistModel playlistModel = new ModelConverter().toPlaylistModel(playlist);
//
//        return GetPlaylistResult.builder()
//                .withPlaylist(playlistModel)
//                .build();
//    }


    @Override
    public GetOrderByIdResult handleRequest(GetOrderByIdRequest getOrderByIdRequest, Context context) {
        String requestedId = getOrderByIdRequest.getOrderId();
        try {
            Order order = OrderDao.getOrder(requestedId);
            return GetOrderByIdResult.builder().withOrder(order).build();
        } catch (OrderNotFoundException e) {
            e.printStackTrace();
        }
       return null;
    }
}
