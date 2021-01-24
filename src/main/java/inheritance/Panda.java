package inheritance;

import java.time.LocalDate;

public class Panda extends Bear{

    static final String colorDescription = "Czarne wybarwienie z białymi paskami i głową";

    public Panda(String name, double weight, LocalDate birthDate) {
        super(name, weight, birthDate);
        foods = new String[]{"bambus"};
    }

    @Override
    public String getColor(){
        return "czarny z białym";
    }

    @Override
    public String toString() {
        return "Panda{" +
                "name='" + name + '\'' +
                ", weight=" + getWeight() +
                ", birthDate=" + birthDate +
                ", colorDescription='" + colorDescription + '\'' +
                '}';
    }

}
