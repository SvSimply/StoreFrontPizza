import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import dynamodb.Order;

public class GetOrdersResult {
    private PaginatedScanList<Order> orders;

    public GetOrdersResult(Builder builder) {
        this.orders = builder.orders;
    }

    public PaginatedScanList<Order> getMenu() {
        return orders;
    }

    public void setOrders(PaginatedScanList<Order> orders) {
        this.orders = orders;
    }

    public static GetOrdersResult.Builder builder() {return new GetOrdersResult.Builder();}

    public static final class Builder {
        private PaginatedScanList<Order> orders;

        public GetOrdersResult.Builder withOrder(PaginatedScanList<Order> ordersToUse) {
            this.orders = ordersToUse;
            return this;
        }
        public GetOrdersResult build() {return new GetOrdersResult(this);}
    }
}
