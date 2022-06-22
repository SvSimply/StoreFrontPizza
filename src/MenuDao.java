//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
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

    public dynamodb.Menu getMenu(String itemId) throws MenuNotFoundException {
        log.fatal("Received item Id {}", itemId);
        dynamodb.Menu menu = this.dynamoDbMapper.load(dynamodb.Menu.class, itemId, "Margherita Pizza");

        if (menu == null) {
            throw new MenuNotFoundException("Cannot find the correct menu" + null);
        }

        return menu;
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
