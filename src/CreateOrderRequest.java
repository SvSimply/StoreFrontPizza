import java.util.ArrayList;
import java.util.Objects;

public class CreateOrderRequest {

    private String orderDate;
    private ArrayList<String> menuItems;
    private String name;
    private String phone;
    private Double total;

    public CreateOrderRequest() {}

    public CreateOrderRequest(String orderDate, ArrayList<String> menuItems, String name, String phone, Double total) {
        this.orderDate = orderDate;
        this.menuItems = menuItems;
        this.name = name;
        this.phone = phone;
        this.total = total;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<String> menuItems) {
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public CreateOrderRequest(Builder builder) {
        this.orderDate = builder.orderDate;
        this.menuItems = builder.menuItems;
        this.name = builder.name;
        this.phone = builder.phone;
        this.total = builder.total;
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private String orderDate;
        private ArrayList<String> menuItems;
        private String name;
        private String phone;
        private Double total;

        private Builder() {

        }

        public Builder withOrderDate(String orderDateToUse) {
            this.orderDate = orderDateToUse;
            return this;
        }

        public Builder withMenuItems(ArrayList<String> menuItemsToUse) {
            this.menuItems = menuItemsToUse;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withTotal(Double total) {
            this.total = total;
            return this;
        }

        public CreateOrderRequest build() { return new CreateOrderRequest(this); }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateOrderRequest that = (CreateOrderRequest) o;
        return Objects.equals(orderDate, that.orderDate) && Objects.equals(menuItems, that.menuItems) && Objects.equals(name, that.name) && Objects.equals(phone, that.phone) && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDate, menuItems, name, phone, total);
    }
}

