package homework.task5;

public class GasCarDemo {

    public static void main(String[] args) {

        GasCar gasCar = new GasCar(50);
        System.out.println("Użycie refuel");
        System.out.println(gasCar.getFuelLevel());
        gasCar.refuel(20);
        System.out.println(gasCar.getFuelLevel());
        System.out.println(gasCar.refuel(60));
        gasCar.refuel(60);
        System.out.println(gasCar.getFuelLevel());
        gasCar.refuel(-200);
        gasCar.refuel(-30);
        System.out.println(gasCar.getFuelLevel());
        ;
        gasCar.refuel(-10);
        System.out.println(gasCar.getFuelLevel());
        gasCar.refuel(0);
        System.out.println(gasCar.getFuelLevel());
        gasCar.refuel(100);
        System.out.println(gasCar.getFuelLevel());
        System.out.println("Użycie consume");
        gasCar.consume(10);
        System.out.println(gasCar.getFuelLevel());
        gasCar.consume(30);
        System.out.println(gasCar.getFuelLevel());
        gasCar.consume(-30);
        System.out.println(gasCar.getFuelLevel());
        gasCar.consume(0);
        System.out.println(gasCar.getFuelLevel());
        System.out.println("**************************");

// Nie mamy dostepu do pól klasy GasCar
        GasCar.HackedGasCar gasCar2 = gasCar.new HackedGasCar(50);
        gasCar2.refuel(30);
        gasCar2.refuel(50);
        System.out.println(gasCar2.getFuelLevel());
        gasCar2.refuel(-60);
        System.out.println(gasCar2.getFuelLevel());
        gasCar2.consume(-50);
        System.out.println(gasCar2.getFuelLevel());
        gasCar2.consume(30);
        System.out.println(gasCar2.getFuelLevel());

    }
}
