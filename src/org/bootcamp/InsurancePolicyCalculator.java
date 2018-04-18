package org.bootcamp;

/**
 * Created by Carla on 18.04.2018.
 */
//singleton class
public final class InsurancePolicyCalculator {
   public static final InsurancePolicyCalculator INSTANCE = new InsurancePolicyCalculator();

    private InsurancePolicyCalculator(){ //private constructor

    }
    public int calculate(Car car){
        int cost = 100 * car.getAge();
        if(car.isDiesel()){
            cost+=500;
        }
        if(car.getNumberOfMiles()>200000){
            cost+=500;
        }
        return cost;
    }
    public int calculate(Bus bus){
        int cost= 200 * bus.getAge();
       cost+= bus.isDiesel()? 1000:0;
        cost+= bus.getNumberOfMiles()>200000 ? 1000 : bus.getNumberOfMiles()>100000 ? 500:0;
        return cost;
    }
    public int calculate(Tipper tip){
        int cost=300 * tip.getAge();
        cost+= tip.getNumberOfMiles()>80000 ? 700:0;
        return cost;
    }
}

