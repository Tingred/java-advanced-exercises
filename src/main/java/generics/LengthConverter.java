package generics;

// klasa implementuje interfejs generyczny z podanymi typmi parametrów
public class LengthConverter implements Converter<LengthInMeter,LengthInMile> {

    @Override
    public LengthInMile convert(LengthInMeter value) {
        return new LengthInMile(value.getLength()/ 1.8);
    }
}
