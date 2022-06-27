package dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.util.ArrayList;

@DynamoDBTable(tableName = "Orders")
public class Order {
    public static final String STATUS_INDEX = "StatusIndex";
    private String orderId;
    private String customerName;
    private String customerPhone;
    private ArrayList<String> menuItems;
    private String status;
    private Double total;
    //TODO: find better data types for dates and change code.
    private String orderDate;
    private String updateDate;

    @DynamoDBHashKey(attributeName = "orderId")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @DynamoDBAttribute(attributeName = "name")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @DynamoDBAttribute(attributeName = "phone")
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

//    DynamoDBMapper converts lists to {@link java.util.ArrayList}s by default
    @DynamoDBAttribute(attributeName = "menuItems")
    public ArrayList<String> getMenuItems() {
        return menuItems;
    }


    public void setMenuItems(ArrayList<String> menuItems) {
        this.menuItems = menuItems;
    }

    @DynamoDBIndexHashKey(attributeName = "status", globalSecondaryIndexName = STATUS_INDEX)
//    @DynamoDBAttribute(attributeName = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @DynamoDBAttribute(attributeName = "total")
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @DynamoDBAttribute(attributeName = "orderDate")
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @DynamoDBAttribute(attributeName = "updateDate")
    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
