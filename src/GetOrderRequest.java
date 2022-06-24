import java.util.Objects;

public class GetOrderRequest {

    private String itemId;

    public GetOrderRequest(Builder builder){this.itemId = builder.itemId;}

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOrderRequest that = (GetOrderRequest) o;
        return Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode(){return Objects.hash(itemId);}

    @Override
    public String toString() {
        return "GetOrderRequest{" +
                "itemId='" + itemId + '\'' +
                '}';
    }

    public static Builder builder() {return new Builder();}

    public static final class Builder {
        private String itemId;

        private Builder(){}

        public Builder withItemId(String itemIdToUse) {
            this.itemId = itemIdToUse;
            return this;
        }


    }
}
