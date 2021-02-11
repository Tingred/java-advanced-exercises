package inheritance.abstractClass;

public class Fatty extends Human {

    double weight;
    double height;

    public Fatty(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void takeARest() {

        if (energy > 100) {
            System.out.println("Jestem już wypoczęty");
        } else {
            System.out.println("Odpoczywam");
            energy += 15;
        }
    }

    @Override
    public void eat() {

        System.out.println("Jem śmieciowe jedzenie");
        if (happiness < 100)
            happiness += 15;
        if (energy<100){
            energy+=5;
        }
        health -=5;
    }
}
