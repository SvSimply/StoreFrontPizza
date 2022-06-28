import java.util.Objects;

public class GetOrderByIdRequest {
    private String orderId;

    public GetOrderByIdRequest() {

    }

    public GetOrderByIdRequest(Builder builder) {
        this.orderId = builder.orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOrderByIdRequest that = (GetOrderByIdRequest) o;
        return Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "GetOrderById{" +
                "id='" + orderId + '\'' +
                '}';
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private String orderId;

        private Builder() {

        }

        public Builder withOrderId(String orderIdToUse) {
            this.orderId = orderIdToUse;
            return this;
        }

        public GetOrderByIdRequest build() { return new GetOrderByIdRequest(this); }
    }
}
