

public class GetOrdersRequest {



    public GetOrdersRequest() {

    }

    public GetOrdersRequest(GetOrdersRequest.Builder builder) {

//        this.itemId = builder.itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetOrdersRequest that = (GetOrdersRequest) o;
        return true;
    }

    @Override
    public String toString() {
        return "GetActiveOrdersRequest";
    }

    public static GetOrdersRequest.Builder builder() { return new GetOrdersRequest.Builder(); }

    public static final class Builder {
//        private String itemId;

        private Builder() {

        }
        public GetOrdersRequest build() { return new GetOrdersRequest(this); }
    }
}
