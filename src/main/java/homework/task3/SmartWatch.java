package homework.task3;

public class SmartWatch extends EquipmnetWithDataTransmission {

    final String strapColor;

    public SmartWatch(String producer, int batteryCapacity, String strapColor) {
        this.producer = producer;
        this.batteryCapacity = batteryCapacity;
        this.strapColor = strapColor;
    }

    public String getStrapColor() {
        return strapColor;
    }

    @Override
    public String sendSMS(String sms) {
        if (isWiFi) {
            return "Your smartwatch is Sending " + sms;
        } else {
            return "Cant send. Turn on Wifi";
        }
    }
}
