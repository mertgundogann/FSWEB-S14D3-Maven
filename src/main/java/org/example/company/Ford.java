//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return this.getClass().getSimpleName() + ": The Ford's engine is starting";
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + ": The Ford is accelerating";
    }

    public String brake() {
        return this.getClass().getSimpleName() + ": The Ford is braking";
    }
}
