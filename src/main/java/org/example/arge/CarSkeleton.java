package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;


    public CarSkeleton() {
    }


    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void startEngine() {
        System.out.println("Engine started for " + name);
    }

    public void drive() {
        System.out.println("Driving the " + name);
        runEngine();
    }


    protected void runEngine() {
        System.out.println("Engine is running smoothly.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
