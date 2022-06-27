public class GetOrderResult {

    private MenuModel menu;

    public GetOrderResult(Builder builder){this.menu = builder.menu;}

    public MenuModel getMenu(){
        return menu;
    }

    public void setMenu(MenuModel menu){this.menu = menu;}

    public static Builder builder() {return new Builder();}

    public static final class Builder {

        private MenuModel menu;

        public Builder withMenu(MenuModel menu){this.menu = menu;
        return this;
        }
        public GetOrderResult build() {return new GetOrderResult(this);}
    }
}
