import dynamodb.MenuDB;

import java.util.Set;

public class ModelConverter {

    public MenuModel toMenuModel(MenuDB menu) {
        return MenuModel.builder()
                .withItemId(menu.getItemId())
                .withName(menu.getName())
                .withDescription(menu.getDescription())
                .withCost(menu.getCost())
                .withIngredients((Set<String>) menu.getIngredients())
                .build();
    }
}