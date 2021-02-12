package homework.task5;

public class GasCarDemo {

    public static void main(String[] args) {

        GasCar gasCar = new GasCar(50);
        gasCar.refuel(100);
        System.out.println(gasCar.getFuelLevel());
        gasCar.refuel(-200);
        System.out.println(gasCar.getFuelLevel());
        System.out.println(gasCar.refuel(100));
        System.out.println(gasCar.getFuelLevel());
        System.out.println(gasCar.refuel(100));
        System.out.println(gasCar.getFuelLevel());
        System.out.println("**************************");
//Dostęp do pól mamy tylko z klasy wewnętrznej w przypadku modyfikatora private
//Nie można zmienić wartości pól nawet wewnętrzną klasą???
        GasCar.HackedGasCar gasCar2 = gasCar.new HackedGasCar(50);
        gasCar2.refuel(100);
        gasCar2.refuel(100);
        System.out.println(gasCar2.getFuelLevel());
        gasCar2.refuel(-200);
        gasCar2.consume(200);
        gasCar2.consume(200);
        System.out.println(gasCar2.getFuelLevel());
        System.out.println(gasCar2.refuel(100));
        System.out.println(gasCar2.getFuelLevel());
        System.out.println(gasCar2.refuel(100));
        System.out.println(gasCar2.getFuelLevel());

    }
}
