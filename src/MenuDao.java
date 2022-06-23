//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import dynamodb.MenuDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class MenuDao {
    AmazonDynamoDB dynamoDBClient;
    DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);

    private final DynamoDBMapper dynamoDbMapper;
    private final Logger log = LogManager.getLogger();

    public MenuDao(DynamoDBMapper dynamoDbMapper) {
        this.dynamoDbMapper = dynamoDbMapper;

    }

    public PaginatedScanList<MenuDB> getMenu() throws MenuNotFoundException {
        log.fatal("Received item Id {}", "menu");
//        MenuDB menu = this.dynamoDbMapper.load(MenuDB.class, itemId, "Margherita Pizza");
        PaginatedScanList<MenuDB> menuList = this.dynamoDbMapper.scan(MenuDB.class, new DynamoDBScanExpression());

        if (menuList == null) {
            throw new MenuNotFoundException("Cannot find the correct menu" + null);
        }

        return menuList;
    }


    class MenuNotFoundException extends Throwable {
        public MenuNotFoundException(String s) {
        }
    }


//    AmazonDynamoDB dynamoDB = AmazonDynamoDBClientBuilder.standard()
//            .withRegion(Regions.US_WEST_2)
//            .withCredentials(new AWSStaticCredentialsProvider
//                    (new BasicAWSCredentials("ACCESS_KEY","SECRET_KEY")))
//            .build();
}
