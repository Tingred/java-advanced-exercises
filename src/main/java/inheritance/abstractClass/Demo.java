package inheritance.abstractClass;

public class Demo {

    public static void main(String[] args) {

        Human human1 = new Fatty(120, 1.7);

        human1.walk(1000);
        System.out.println(human1.getEnergy());
        human1.walk(1000);
        System.out.println(human1.getEnergy());
        human1.takeARest();
        System.out.println(human1.getEnergy());

        Sportsman sportsman1 = new Sportsman(75, 180);
        sportsman1.walk(3000);
        sportsman1.eat();
        sportsman1.takeARest();
        System.out.println(sportsman1.getEnergy());
        System.out.println(sportsman1.getHappiness());
        System.out.println(sportsman1.getHealth());

    }
}
