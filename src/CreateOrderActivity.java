import dynamodb.Order;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.management.InvalidAttributeValueException;
import com.amazonaws.services.lambda.runtime.Context;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class CreateOrderActivity  {

    private final Logger log = LogManager.getLogger();

    private final OrderDao orderDao;
    public CreateOrderActivity(OrderDao orderDao) {
        this.orderDao = orderDao;
    }


    public CreateOrderResult handleRequest(final CreateOrderRequest createOrderRequest, Context context) throws InvalidAttributeValueException {
        log.info("Received CreateOrderRequest {}", createOrderRequest);

        if(!PizzaOrderServiceUtils.isValidString(createOrderRequest.getName())) {
            throw new InvalidAttributeValueException("Customer's name contains invalid characters.");
        }

        if(!PizzaOrderServiceUtils.isValidString(createOrderRequest.getPhone())) {
            throw new InvalidAttributeValueException("Customer's phone contains invalid characters.");
        }

        if(createOrderRequest.getMenuItems() == null || createOrderRequest.getMenuItems().size() == 0) {
            throw new InvalidAttributeValueException("The order's list is empty.");
        }

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);

        Order newOrder = new Order();
        newOrder.setOrderId(PizzaOrderServiceUtils.generateOrderId());
        newOrder.setStatus("RECEIVED");
        newOrder.setOrderDate(strDate);
        newOrder.setCustomerName(createOrderRequest.getName());
        newOrder.setTotal(createOrderRequest.getTotal());
        newOrder.setCustomerPhone(createOrderRequest.getPhone());
        newOrder.setUpdateDate(strDate);

        // deep copy for menuItems list
        ArrayList<String> newItemsList = new ArrayList<>(createOrderRequest.getMenuItems());
        newOrder.setMenuItems(newItemsList);

        orderDao.saveOrder(newOrder);

        return CreateOrderResult.builder()
                .withOrder(newOrder)
                .build();
    }

}
