//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Car [name=" + this.name + ", cylinders=" + this.cylinders + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && this.getClass() == obj.getClass()) {
            Car car = (Car)obj;
            return this.cylinders == car.cylinders && this.name.equals(car.name);
        } else {
            return false;
        }
    }

    public String startEngine() {
        printSimpleName();
        return "the car's engine is starting";

    }


    public String accelerate() {
        printSimpleName();
        return "the car is accelerating";
    }
    private void printSimpleName(){
        System.out.println("Class Name: "+getClass().getSimpleName());
    }


    public String brake() {
        printSimpleName();
        return "the car is braking";
    }
}
