//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.regions.Regions;

import Exceptions.MenuNotFoundException;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import dynamodb.MenuDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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




    public MenuDB saveOrder(MenuDB menu){
        dynamoDbMapper.save(menu);
        return menu;
    }


//    AmazonDynamoDB dynamoDB = AmazonDynamoDBClientBuilder.standard()
//            .withRegion(Regions.US_WEST_2)
//            .withCredentials(new AWSStaticCredentialsProvider
//                    (new BasicAWSCredentials("ACCESS_KEY","SECRET_KEY")))
//            .build();
}
