package org.bootcamp.vehicle;

/**
 * Created by Carla on 18.04.2018.
 */
public class Tipper extends Vehicle {
    private int capacityInTons;

    public Tipper(){

    }

    public Tipper(int age, long numberOfMiles, boolean isDiesel, int capacityInTons) {
        super(age,numberOfMiles,isDiesel);
        this.capacityInTons = capacityInTons;
    }

    public Tipper(int age, long numberOfMiles, boolean isDiesel) {
        super(age, numberOfMiles, isDiesel);
    }

    public int getCapacityInTons() {
        return capacityInTons;
    }

    public void setCapacityInTons(int capacityInTons) {
        this.capacityInTons = capacityInTons;
    }
}
