import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import dynamodb.MenuDB;

public class GetMenuResult {
    private PaginatedScanList<MenuDB> menu;

    public GetMenuResult(Builder builder) {
        this.menu = builder.menu;
    }

    public PaginatedScanList<MenuDB> getMenu() {
        return menu;
    }

    public void setMenu(PaginatedScanList<MenuDB> menu) {
        this.menu = menu;
    }

    public static Builder builder() {return new Builder();}

    public static final class Builder {
        private PaginatedScanList<MenuDB> menu;

        public Builder withMenu(PaginatedScanList<MenuDB> menuToUse) {
            this.menu = menuToUse;
            return this;
        }
        public GetMenuResult build() {return new GetMenuResult(this);}
    }
}
