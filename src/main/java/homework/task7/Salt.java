package homework.task7;

public class Salt implements Ingredient {

    private static final double CALORIES_PER_GRAM = 0;
    private static final double PRICE_PER_GRAM = 0.0002;
    private final double weight;
    private final String name;

    public Salt(String name, double weight) {
        this.weight = weight;
        this.name = name;
    }
    @Override
    public double price() {
        return weight*PRICE_PER_GRAM;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return weight*CALORIES_PER_GRAM;

    }

    @Override
    public String toString() {
        return "Tomato{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
