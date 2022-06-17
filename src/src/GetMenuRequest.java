import java.util.Objects;

public class GetMenuRequest {
    private String itemId;

    public GetMenuRequest() {

    }

    public GetMenuRequest(Builder builder) {
        this.itemId = builder.itemId;
    }

    public String getId() {
        return itemId;
    }

    public void setId(String id) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMenuRequest that = (GetMenuRequest) o;
        return Objects.equals(itemId, that.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return "GetPlaylistRequest{" +
                "itemId='" + itemId + '\'' +
                '}';
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private String itemId;

        private Builder() {

        }

        public Builder withId(String idToUse) {
            this.itemId = idToUse;
            return this;
        }

        public GetMenuRequest build() { return new GetMenuRequest(this); }
    }
}
