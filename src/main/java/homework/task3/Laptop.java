package homework.task3;

public class Laptop extends EquipmnetWithDataTransmission {

    final String dvdDrive;
    final int powerSupply;

    public Laptop(int batteryCapacity, String dvdDrive, int powerSupply, String producer) {
        this.batteryCapacity = batteryCapacity;
        this.dvdDrive = dvdDrive;
        this.powerSupply = powerSupply;
        this.producer = producer;
    }

    public String getDvdDrive() {
        return dvdDrive;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    @Override
    public String sendSMS(String sms) {
        if (isWiFi) {
            return "Your laptop is sending " + sms;
        } else {
            return "Cant send. Turn on Wifi";
        }
    }
}
