package org.bootcamp.formula;

import org.bootcamp.vehicle.Vehicle;

/**
 * Created by Carla on 18.04.2018.
 */
public final class CarBasicFormula implements Formula {
    @Override
    public int calculate(Vehicle vehicle) {
        int cost = 100 * vehicle.getAge();
        if(vehicle.isDiesel()){
            cost+=500;
        }
        if(vehicle.getNumberOfMiles()>200000){
            cost+=500;
        }
        return cost;
    }
}
