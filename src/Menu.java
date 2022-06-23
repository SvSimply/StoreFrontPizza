import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import dynamodb.MenuDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Menu {
    /*
    * the menu class with the different types of pizzas we serve.

    * the price is represented in cents because doubles are not represented too well for precise calculations,
    we will have to divide by 100 in the calculator to actually get the right price because this will give the exact
    change and be precise.

    * this is what I have in the menu because I have no clue if we are going to add more, This can be added later in the
    development of the project. The reason why I added a hashmap instead of an ArrayList it is because the hashmap
    is faster than an ArrayList. In this hashmap I also have the prices of the product in the hashmap, so it can be
    easier when we go to change prices and just for the display of the products.
     */
//    public static HashMap<String, Integer> menu = new HashMap<>();
//
//    static {
//        menu.put("LARGE PEPPERONI PIZZA", 799);
//        menu.put("LARGE HAM PIZZA", 799);
//        menu.put("LARGE CHEESE PIZZA", 799);
//        menu.put("MEDIUM PEPPERONI PIZZA", 599);
//        menu.put("MEDIUM HAM PIZZA", 599);
//        menu.put("MEDIUM CHEESE PIZZA", 599);
//        menu.put("MEDIUM ANCHOVIE PIZZA", 599);
//        menu.put("CHEESE CRUST", 699);
//        menu.put("NORMAL CRUST", 699);
//        menu.put("PEPPERONI", 250);
//        menu.put("CHEESE", 199);
//        menu.put("HAM", 250);
//        menu.put("SAUSAGE", 250);
//        menu.put("EXTRA CHEESE", 399);
//        menu.put("OLIVE", 199);
//        menu.put("MUSHROOM", 199);
//        menu.put("LARGE COKE", 299);
//        menu.put("MEDIUM COKE", 199);
//    }

    /*
    this test will be updated later in the design, I cannot put a runtime error as of now because I think I need a
    front end set up for a timer. I can alternatively just put a for loop that counts to the minute then automatically
    have the exception thrown, That would be too "Sloppy" for me. So instead I just have the test basically equal null,
    as in if there is no first parameter then it will throw a AttributeValueException for obvious reasons.
     */
//    @Test (dataProviderClass = InvalidAttributeValueException.class)
//    public void GetMenuTest(){
//        if(menu.isEmpty()) {
//            fail("The menu is unpopulated.");
//        }
//        System.out.println("Menu is populated.");
//    }
    /*
    I have decided not to add a time-out exception because It would be sort of pointless as of right now. I can always add
    the timeout exception later in development.
     */

    private final Logger log = LogManager.getLogger();

    private final MenuDao menuDao;

    public Menu(MenuDao menuDao){this.menuDao = menuDao;}

    public GetMenuResult handleRequest(final GetMenuRequest getMenuRequest) throws MenuDao.MenuNotFoundException {
        log.info("Received GetPlaylistRequest {}", getMenuRequest);
//        String requestedId = getMenuRequest.getItemId();
        PaginatedScanList<MenuDB> menu = menuDao.getMenu();
        return GetMenuResult.builder()
                .withMenu(menu)
                .build();
    }
}
