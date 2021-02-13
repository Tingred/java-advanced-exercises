package generics;

public class BoxApp {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("TEST", 10);
        System.out.println(stringBox.getContent());
        Box<Integer> integerBox = new Box<>(125, 5);
        System.out.println(integerBox.getContent());
        Box<Person> personBox = new Box<>(new Person("Robert", 170),200);
        System.out.println(personBox.getContent());

        // do pudełka generycznego typu bazowego (Person) można dodać typ pochodny (User)
        personBox = new Box<>(new User("robert", 178, "robert@gmial.com"), 250);
        System.out.println(personBox.getContent());

       // do pudełka na obiekty typu interfejsu możemy dodawać dowolne obiekty
        //imprementujące ten interfejs
        Box<Boxable> universalBox = new Box<>(new User("robert", 160, "rob@wp.pl"), 100);
        universalBox = new Box<>(new StringBoxable("test"), 30);
    }
}
