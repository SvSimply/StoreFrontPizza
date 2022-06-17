import java.awt.*;
public class MenuDao {

    private final DynamoDBMapper dynamoDbMapper;
    private final MenuDao menuDao;

    public MenuDao(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    public Menu getMenu(String id) throws MenuNotFoundException {
        Menu menu = this.dynamoDbMapper.load(Menu.class);

        if (menu == null) {
            throw new MenuNotFoundException("Cannot find the correct menu" + null);
        }

        return menu;
    }


    private class MenuNotFoundException extends Throwable {
        public MenuNotFoundException(String s) {
        }
    }
}
