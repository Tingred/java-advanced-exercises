package homework.task3;


abstract public class EquipmnetWithDataTransmission {

    int batteryCapacity;
    boolean isWiFi;
    String producer;

    public int maxWorkTime(int consumptionPerHour) {
        return batteryCapacity / consumptionPerHour;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getProducer() {
        return producer;
    }

    public boolean isWiFi() {
        return isWiFi;
    }

    public void setWiFi(boolean wiFi) {
        isWiFi = wiFi;
    }
    abstract public String sendSMS(String sms);



}
