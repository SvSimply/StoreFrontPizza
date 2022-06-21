
public class GetMenuResult {
    private MenuModel menu;
    public GetMenuResult(Builder builder) {
        this.menu = builder.menu;
    }
    public MenuModel getMenu() {
        return menu;
    }
    public void setMenu(MenuModel playlist) {
        this.menu = playlist;
    }
    public static Builder builder() {return new Builder();}
    public static final class Builder {
        private MenuModel menu;
        public Builder withMenu(MenuModel menuToUse) {
            this.menu = menuToUse;
            return this;
        }
        public GetMenuResult build() {return new GetMenuResult(this);}
    }
}
