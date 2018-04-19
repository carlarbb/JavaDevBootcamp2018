package org.bootcamp.formula;
import org.bootcamp.vehicle.Vehicle;

/**
 * Created by Carla on 19.04.2018.
 */
public enum Formula {
        /**
         * Created by Carla on 19.04.2018.
         */
        CARBASICFORMULA {
            @Override
            public int calculate(Vehicle vehicle) {
                int cost = 100 * vehicle.getAge();
                if (vehicle.isDiesel()) {
                    cost += 500;
                }
                if (vehicle.getNumberOfMiles() > 200000) {
                    cost += 500;
                }
                return cost;
            }
        },

            BUSBASICFORMULA{
                @Override
                public int calculate(Vehicle vehicle) {
                    int cost= 200 * vehicle.getAge();
                    cost+= vehicle.isDiesel()? 1000:0;
                    cost+=vehicle.getNumberOfMiles()>200000 ? 1000 : vehicle.getNumberOfMiles()>100000 ? 500:0;
                    return cost;
                }
            },

            TIPPERBASICFORMULA{
                @Override
                public int calculate(Vehicle vehicle) {
                    int cost=300 * vehicle.getAge();
                    cost+= vehicle.getNumberOfMiles()>80000 ? 700:0;
                    return cost;
                }
            };


            public abstract int calculate(Vehicle vehicle);
        }


