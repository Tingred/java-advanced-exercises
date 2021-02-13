package generics;

public class LengthApp {
    public static void main(String[] args) {

        // Ograniczenie typów parametrów powoduje, że możemy utworzyć tylko klasy z typów pochodnych po Legnth
        UniversalLengthConverter<Length,LengthInMeter> universalLengthConverter = new UniversalLengthConverter<>();
        UniversalLengthConverter<Length,Length> ll = new UniversalLengthConverter<>();

    }

}
