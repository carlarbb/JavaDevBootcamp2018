package org.bootcamp.formula;

import org.bootcamp.vehicle.Vehicle;

/**
 * Created by Carla on 18.04.2018.
 */
//all methods in an interface are public -> don't specify any access modifier
public interface Formula {
    int calculate(Vehicle vehicle);
}

