package org.bootcamp;

//redenumire clasa - click pe nume clasa, Shift+F6 -> nume nou (modificare automata la fisier)
//o interfata poate avea doar atribute statice
//o clasa abstracta poate avea atribute
//key-words-urile diferentiaza interfetele de clasele abstracte in java, fata de c++
//nu exista Segmentation Fault

import com.sun.org.apache.xpath.internal.operations.Bool;
import jdk.internal.util.xml.impl.Input;
import org.bootcamp.calculator.InsurancePolicyCalculator;
import org.bootcamp.formula.Formula;
import org.bootcamp.vehicle.Bus;
import org.bootcamp.vehicle.Car;
import org.bootcamp.vehicle.Tipper;
import org.bootcamp.vehicle.Vehicle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class MainApp {

   private static final String OUTPUT_FORMAT = "Vehicle with id %s has total cost %d";
    private static final int VEHICLE_ID = 0;
    private static final int VEHICLE_TYPE = 1;
    private static final int VEHICLE_AGE = 3;
    private static final int VEHICLE_MILES = 4;

    private static final int VEHICLE_IS_DIESEL = 5;

    public static void main(String[] args) {

        final InsurancePolicyCalculator calculator =InsurancePolicyCalculator.INSTANCE;
        if(args.length >=1){
            final File inputFile = new File(args[0]);
            try{
                final InputStream inputStream = new FileInputStream(inputFile);
                final Scanner scanner = new Scanner(inputStream);

                while(scanner.hasNextLine()){
                  final String line = scanner.nextLine();
                    String SEPARATOR = ";";
                    final String[] tokens = line.split(SEPARATOR);

                  //parsare- transformare de la String la tip de date


                    final Vehicle vehicle = getVehicle(tokens[VEHICLE_TYPE], Integer.parseInt(tokens[VEHICLE_AGE]),
                                    Long.parseLong(tokens[VEHICLE_MILES]),Boolean.parseBoolean(tokens[VEHICLE_IS_DIESEL]));

                  final Formula formula = Formula.valueOf(tokens[2]);
                  final int totalCost =calculator.calculate(vehicle, formula);


                    final String output= String.format(OUTPUT_FORMAT, tokens[VEHICLE_ID], totalCost);
                    System.out.println(calculator.calculate(vehicle, formula));
                }
                scanner.close();
            }catch(FileNotFoundException noFileFound){
                System.out.println(noFileFound.getMessage());
            }
        }
        else{
            System.out.println("No arguments!");
        }
    }
   private static Vehicle getVehicle(String vehicleName, int age, long numberOfMiles, boolean isDiesel){
       final String carClassName= Car.class.getSimpleName().toUpperCase();
       final String busClassName= Bus.class.getSimpleName().toUpperCase();
       final String tipperClassName= Tipper.class.getSimpleName().toUpperCase();

       if(vehicleName.equals(carClassName)){
           return new Car(age,numberOfMiles,isDiesel);
       }

       if(vehicleName.equals(busClassName)){
           return new Bus(age,numberOfMiles,isDiesel);
       }
       if(vehicleName.equals(tipperClassName)) {
           return new Tipper(age, numberOfMiles, isDiesel);
       }
       return null;
   }
}

