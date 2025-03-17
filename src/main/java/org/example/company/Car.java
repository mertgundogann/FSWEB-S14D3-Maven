package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Car [name=" + name + ", cylinders=" + cylinders + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }


    public String startEngine() {
        return "Car" + getClass().getSimpleName() + ": The car's engine is starting";
    }



    public String accelerate() {
        return getClass().getSimpleName() + "Car: The car is accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + ": The car is braking";
    }
}
