package homework.task6;

public class HumanTemperature {

    private final double temperature;

    private HumanTemperature(double temperature) {
        this.temperature = temperature;
    }

    public static HumanTemperature of(double temperaturee) {
        if (temperaturee >= 20 && temperaturee <= 43) {
            return new HumanTemperature(temperaturee);
        } else return null;
    }

    public double get() {
        return temperature;
    }

    public double getKelvin() {
        return temperature + 273.15;
    }

    public double getFahrenheit() {
        return 32 + ((double)(9 / 5)* temperature);
    }
    public boolean isNormal(){
        if (temperature>=36 && temperature<=37){
            return true;
        }
        else return false;
    }
    public void format(){
        System.out.printf("Teperatura wynosi: %.2f °C \n",temperature);
    }
}

