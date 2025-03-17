package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;


    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }


    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }


    @Override
    public void startEngine() {
        System.out.println("Starting electric motor with battery size of " + batterySize + " kWh.");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving electric car with battery size: " + batterySize + " kWh, " +
                "and efficiency: " + avgKmPerCharge + " km per charge.");
    }
}
