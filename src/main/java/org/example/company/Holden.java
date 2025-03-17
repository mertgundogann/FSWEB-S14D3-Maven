//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return this.getClass().getSimpleName() + ": The Holden's engine is starting";
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + ": The Holden is accelerating";
    }

    public String brake() {
        return this.getClass().getSimpleName() + ": The Holden is braking";
    }
}
