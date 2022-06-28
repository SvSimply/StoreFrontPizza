import dynamodb.Order;

public class UpdateOrderResult {
    private Order order;

    public UpdateOrderResult(Builder builder) {
        this.order = builder.order;
    }

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

        public UpdateOrderResult build() {return new UpdateOrderResult(this);}
    }
}
