package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": The Holden's engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": The Holden is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": The Holden is braking";
    }
}
