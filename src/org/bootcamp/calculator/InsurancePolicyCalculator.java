package org.bootcamp.calculator;

import org.bootcamp.formula.Formula;
import org.bootcamp.vehicle.Vehicle;

/**
 * Created by Carla on 18.04.2018.
 */
//singleton class
public final class InsurancePolicyCalculator {
   public static final InsurancePolicyCalculator INSTANCE = new InsurancePolicyCalculator();

    private InsurancePolicyCalculator(){ //private constructor

    }
    public int calculate(Vehicle vehicle, Formula formula){
        return formula.calculate(vehicle);
    }

}

