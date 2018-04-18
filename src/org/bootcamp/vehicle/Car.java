package org.bootcamp;

import org.bootcamp.Vehicle;

/**
 * Created by Carla on 18.04.2018.
 */
public final class Car extends Vehicle {  //final pentru ca clasa org.bootcamp.Car sa nu mai poata fi mostenita
    private String transmission = "manual";

    public Car(){

    }

    public Car(int age, long numberOfMiles, boolean isDiesel, String transmission) {
        super(age, numberOfMiles, isDiesel);
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
