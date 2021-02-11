package inheritance.abstractClass;

abstract public class Human {

    double energy =50;
    double happiness =50;
    double health =50;

    public abstract void takeARest();

    public abstract void eat();

    public void walk(int meters) {
        this.energy -= 0.0015 * meters;
    }

    public void smile() {
        if (happiness < 100) happiness += 3;
    }


    public double getEnergy() {
        return energy;
    }

    public double getHappiness() {
        return happiness;
    }

    public double getHealth() {
        return health;
    }
}
