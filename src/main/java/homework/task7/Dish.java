package homework.task7;

public class Dish implements Ingredient {
    Ingredient[] ingredients;

    public Dish(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public double price() {
        double dishPrice = 0;
        for (Ingredient ingredient : ingredients) {
            dishPrice += ingredient.price();
        }
        return dishPrice;
    }

    @Override
    public double weight() {
        double dishWeight = 0;
        for (Ingredient ingredient : ingredients) {
            dishWeight += ingredient.weight();
        }
        return dishWeight;
    }

    @Override
    public double calories() {
        double dishCalories = 0;
        for (Ingredient ingredient : ingredients) {
            dishCalories += ingredient.calories();
        }
        return dishCalories;
    }
}
