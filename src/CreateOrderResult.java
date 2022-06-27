public class CreateOrderResult {
    private MenuModel menu;
    public CreateOrderResult(Builder builder) {this.menu = builder.menu;}
    public MenuModel getMenu() {return menu;}
    public void setMenu(MenuModel menu) {this.menu = menu;}
    public static Builder builder() {return new Builder();}
    public static final class Builder {
        private MenuModel menu;
        public Builder withOrder(MenuModel menu) {
            this.menu = menu;
            return this;
        }





        public CreateOrderResult build() {return new CreateOrderResult(this);}
    }
}