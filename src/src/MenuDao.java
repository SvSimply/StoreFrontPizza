import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
public class MenuDao {
    AmazonDynamoDB dynamoDBClient = new AmazonDynamoDBClient();
    DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);

    private final DynamoDBMapper dynamoDbMapper;
    private final MenuDao menuDao;

    public MenuDao(DynamoDBMapper dynamoDbMapper, MenuDao menuDao) {
        this.dynamoDbMapper = dynamoDbMapper;
        this.menuDao = menuDao;
    }

    public Menu getMenu(String id) throws MenuNotFoundException {
        Menu menu = this.dynamoDbMapper.load(Menu.class, "TEMP");

        if (menu == null) {
            throw new MenuNotFoundException("Cannot find the correct menu" + null);
        }

        return menu;
    }


    private class MenuNotFoundException extends Throwable {
        public MenuNotFoundException(String s) {
        }
    }

    AmazonDynamoDB dynamoDB = AmazonDynamoDBClientBuilder.standard()
            .withRegion(Regions.US_WEST_2)
            .withCredentials(new AWSStaticCredentialsProvider
                    (new BasicAWSCredentials("ACCESS_KEY","SECRET_KEY")))
            .build();
}
