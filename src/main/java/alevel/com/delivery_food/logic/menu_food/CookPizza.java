package alevel.com.delivery_food.logic.menu_food;

import alevel.com.delivery_food.data.type_food.Pizza;

public interface CookPizza {

    default void cookPizza(Pizza pizzaType) {

        switch (pizzaType) {
            case HAWAIIAN:
                cookHawaiian();
                break;
            case MARGARITA:
                cookMargarita();
                break;
            case SEASONS:
                cookSeasons();
                break;
            case MOM_MIA:
                cookMomMia();
                break;
            case MEXICAN:
                cookMexican();
                break;
            case PEPPERONI:
                cookPepperoni();
                break;
            case VEGETARIAN:
                cookVegetarian();
                break;
            case HUNTING:
                cookHunting();
                break;
        }
    }

    void cookHawaiian();

    void cookMargarita();

    void cookSeasons();

    void cookMomMia();

    void cookMexican();

    void cookPepperoni();

    void cookVegetarian();

    void cookHunting();

}
