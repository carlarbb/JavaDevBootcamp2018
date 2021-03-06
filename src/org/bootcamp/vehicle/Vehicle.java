package org.bootcamp.vehicle;

/**
 * Created by Carla on 18.04.2018.
 */
public abstract class Vehicle {
    private int age;
    private long numberOfMiles;
    private boolean isDiesel;

    public Vehicle(int age, long numberOfMiles, boolean isDiesel) {
        this.age = age;
        this.numberOfMiles = numberOfMiles;
        this.isDiesel = isDiesel;
    }

    public Vehicle(){

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getNumberOfMiles() {
        return numberOfMiles;
    }

    public void setNumberOfMiles(long numberOfMiles) {
        this.numberOfMiles = numberOfMiles;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }
}
