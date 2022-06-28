import java.util.Objects;

public class GetMenuRequest {

    public GetMenuRequest() {
    }

    public GetMenuRequest(Builder builder) {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMenuRequest that = (GetMenuRequest) o;
        return true;
    }


    @Override
    public String toString() {
        return "GetMenuRequest";
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {

        private Builder() {
        }

        public GetMenuRequest build() { return new GetMenuRequest(this); }
    }
}
