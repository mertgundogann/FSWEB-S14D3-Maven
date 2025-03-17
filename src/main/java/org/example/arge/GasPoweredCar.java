package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }


    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }


    @Override
    public void startEngine() {
        System.out.println("Starting gas engine with " + cylinders + " cylinders.");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving gas-powered car with fuel efficiency: " + avgKmPerLitre + " km per litre.");
    }
}
