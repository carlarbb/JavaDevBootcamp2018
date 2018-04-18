package org.bootcamp;

/**
 * Created by Carla on 18.04.2018.
 */
public class Bus extends Vehicle {
    private int numberOfSeats;

    public Bus(){

    }

    public Bus(int age, long numberOfMiles, boolean isDiesel, int numberOfSeats) {
        super(age,numberOfMiles,isDiesel);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
