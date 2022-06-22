import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class MenuModel {
    private String itemId;
    private String name;
    private String description;
    private String category;
    private Double cost;
    private ArrayList<String> ingredients;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        MenuModel that = (MenuModel) o;
        return cost == that.cost &&
                Objects.equals(itemId, that.itemId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(category, that.category) &&
                Objects.equals(ingredients, that.ingredients);
    }

    @Override
    public int hashCode() {return Objects.hash(itemId, name, description, category,cost, ingredients);}

    @Override
    public String toString() {
        return "MenuModel{" +
                "itemId='" + itemId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                ", ingredients=" + ingredients +
                '}';
    }

    public static Builder builder(){return new Builder();}

    public static final class Builder {

        private String itemId;
        private String name;
        private String description;
        private String category;
        private ArrayList<String> ingredients;
        private double cost;

        public Builder withItemId(String itemId) {this.itemId = itemId; return this;}

        public Builder withName(String name){this.name = name; return this;}

        public Builder withDescription(String description) {this.description = description; return this;}

        public Builder withCategory(String category) {this.category = category; return this;}

        public Builder withCost(double cost) {this.cost = cost; return this;}

        public Builder withIngredients(Set<String> ingredientsToUse) {

            ArrayList<String> ingredients = new ArrayList<String>();
            this.ingredients = ingredients;
            return this;
        }

        public MenuModel build() {return new MenuModel();}


    }
}

