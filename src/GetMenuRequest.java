import java.util.Objects;

public class GetMenuRequest {
//    private String itemId;


    public GetMenuRequest() {

    }

    public GetMenuRequest(Builder builder) {

//        this.itemId = builder.itemId;
    }

//    public String getItemId() {
//        return itemId;
//    }

//    public void setItemId(String itemId) {
//        this.itemId = itemId;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMenuRequest that = (GetMenuRequest) o;
        return true;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(itemId);
//    }

    @Override
    public String toString() {
        return "GetMenuRequest";
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
//        private String itemId;

        private Builder() {

        }

//        public Builder withId(String idToUse) {
////            this.itemId = idToUse;
//            return this;
//        }

        public GetMenuRequest build() { return new GetMenuRequest(this); }
    }
}