package inheritance.abstractClass;

public class Sportsman extends Human {

    double weight;
    double height;

    public Sportsman(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void takeARest() {
        if (energy < 100) {
            System.out.println("Odpoczywam");
            energy += 25;
        }
        else System.out.println("Nie potrzebuję odpoczynku");
    }

    @Override
    public void eat() {

        if (energy<100){
            energy+=10;
            System.out.println("Jem posiłek");
            if (happiness<100){
                happiness+=5;
            }
            if (health<100){
                health+=5;
            }
        }
        else System.out.println("Jestem najedzony");
    }
}
