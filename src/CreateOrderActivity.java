import com.amazonaws.services.lambda.runtime.RequestHandler;
import dynamodb.MenuDB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;
import javax.management.InvalidAttributeValueException;
import javax.naming.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CreateOrderActivity implements RequestHandler<CreateOrderRequest, CreateOrderResult> {

    private final Logger log = LogManager.getLogger();
    private final MenuDao MenuDao;

    @Inject
    public CreateOrderActivity(MenuDao MenuDao) {
        this.MenuDao = MenuDao;
    }

    @Override
    public CreateOrderResult handleRequest(final CreateOrderRequest createOrderRequest, Context context) throws InvalidAttributeValueException {
        log.info("Received CreateOrderRequest {}", createOrderRequest);
        if(!PizzaOrderServiceUtils.isValidString(createOrderRequest.getName())) {
            throw new InvalidAttributeValueException();
        }
        MenuDB menu = new MenuDB();
        menu.setName(createOrderRequest.getName());
        menu.setCost((double) 0);
        menu.setIngredients((ArrayList<String>) createOrderRequest.getIngredients());
        Set<String> s = new HashSet();
        s.add("Topping");
        s.add("Cheese");
        s.add("Dough");
        s.add("Drink");
        s.add("Sides");
        String arr[] = { "Topping", "Cheese", "Dough", "Drink", "Sides"};

        menu.setItemId(PizzaOrderServiceUtils.generateOrderId());
        MenuDao.saveOrder(menu);
        return CreateOrderResult.builder()
                .withOrder(new ModelConverter().toMenuModel(menu))
                .build();
    }
}
