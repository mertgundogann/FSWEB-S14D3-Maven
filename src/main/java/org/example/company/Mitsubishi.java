//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return this.getClass().getSimpleName() + ": The Mitsubishi's engine is starting";
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + ": The Mitsubishi is accelerating";
    }

    public String brake() {
        return this.getClass().getSimpleName() + ": The Mitsubishi is braking";
    }
}
