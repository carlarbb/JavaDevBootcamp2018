package org.bootcamp;
//redenumire clasa - click pe nume clasa, Shift+F6 -> nume nou (modificare automata la fisier)
//o interfata poate avea doar atribute statice
//o clasa abstracta poate avea atribute
//key-words-urile diferentiaza interfetele de clasele abstracte in java, fata de c++
//nu exista Segmentation Fault

public class MainApp {

    public static void main(String[] args) {
        //final pentru a nu putea modifica referinta
        final Car joesCar = new Car(5,2000,true,"auto");
        final Bus stevesBus = new Bus(3,100000,true,31);
        final Tipper petersTipper= new Tipper(6, 80000,false,15);

        final InsurancePolicyCalculator calculator= InsurancePolicyCalculator.INSTANCE;
        final int joesInsurancePolicyCost = calculator.calculate(joesCar);
        final int stevesInsurancePolicyCost = calculator.calculate(stevesBus);
        final int petersInsurancePolicyCost = calculator.calculate(petersTipper);


      //folosire operatori ternari in loc de if

        System.out.println("Joe's policy cost is: "+ joesInsurancePolicyCost);
        System.out.println("Steve's policy cost is: "+ stevesInsurancePolicyCost);
        System.out.println("Peter's policy cost is: "+ petersInsurancePolicyCost);
    }
}
