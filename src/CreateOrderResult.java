import dynamodb.Order;

public class CreateOrderResult {
    private Order order;

    public CreateOrderResult(Builder builder) {this.order = builder.order;}

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public static Builder builder() {return new Builder();}

    public static final class Builder {
        private Order order;

        public Builder withOrder(Order orderToUse) {
            this.order = orderToUse;
            return this;
        }

        public CreateOrderResult build() {return new CreateOrderResult(this);}
    }
}