package org.bootcamp;

/**
 * Created by Carla on 18.04.2018.
 */
public final class TipperBasicFormula implements Formula {
    @Override
    public int calculate(Vehicle vehicle) {
        int cost=300 * vehicle.getAge();
        cost+= vehicle.getNumberOfMiles()>80000 ? 700:0;
        return cost;
    }
}