import java.util.ArrayList;
import java.util.Objects;

public class CreateOrderRequest {

    private String name;

    private String description;

    private ArrayList<String> ingredients;

    public CreateOrderRequest(String name, String description, ArrayList<String> ingredients) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
    }

    public CreateOrderRequest(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.ingredients = builder.ingredients;
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

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateOrderRequest that = (CreateOrderRequest) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(ingredients, that.ingredients);
    }

    @Override
    public String toString() {
        return "CreateOrderRequest{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {

        private String name;

        private String description;

        private ArrayList<String> ingredients;

        private Builder(){

        }

        public Builder withName(String nameToUse){
            this.name = nameToUse;
            return this;
        }

        public Builder withDescription(String descriptionToUse){
            this.description = descriptionToUse;
            return this;
        }

        public Builder withIngredients(ArrayList<String> ingredientsToUse) {
            this.ingredients = ingredientsToUse;
            return this;
        }

        public CreateOrderRequest build() {return new CreateOrderRequest(this);}



    }
}

