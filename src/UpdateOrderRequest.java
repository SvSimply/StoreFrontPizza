public class UpdateOrderRequest {
    private String orderId;
    private String status;

    public UpdateOrderRequest() {
    }
    public UpdateOrderRequest(String orderId, String status) {
        this.orderId = orderId;
        this.status = status;

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateOrderRequest(Builder builder) {
        this.orderId = builder.orderId;
        this.status = builder.status;

    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private String orderId;
        private String status;


        private Builder() {

        }

        public Builder withOrderId(String orderIdToUse) {
            this.orderId = orderIdToUse;
            return this;
        }

        public Builder withStatus(String statusToUse) {
            this.status = statusToUse;
            return this;
        }


        public UpdateOrderRequest build() { return new UpdateOrderRequest(this); }
    }

}