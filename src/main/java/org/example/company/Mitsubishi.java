package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": The Mitsubishi's engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": The Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": The Mitsubishi is braking";
    }
}
