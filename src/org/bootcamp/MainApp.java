package org.bootcamp;
//redenumire clasa - click pe nume clasa, Shift+F6 -> nume nou (modificare automata la fisier)
//o interfata poate avea doar atribute statice
//o clasa abstracta poate avea atribute
//key-words-urile diferentiaza interfetele de clasele abstracte in java, fata de c++
//nu exista Segmentation Fault

public class MainApp {

    public static void main(String[] args) {
        //final pentru a nu putea modifica referinta
       final Vehicle joesCar = new Car(5,2000,true,"auto");
       final Vehicle stevesBus = new Bus(3,100000,true,31);
       final Vehicle petersTipper= new Tipper(6, 80000,false,15);

       int joesInsurancePolicyCost = 100 * joesCar.getAge();

       //mereu { la if
      /* if(joesCar.isDiesel()){
           joesInsurancePolicyCost +=500;
       }*/
      int stevesInsurancePolicyCost= 200 * stevesBus.getAge();
      stevesInsurancePolicyCost+= stevesBus.isDiesel()? 1000:0;
      stevesInsurancePolicyCost+= stevesBus.getNumberOfMiles()>200000 ? 1000 : stevesBus.getNumberOfMiles()>100000 ? 500:0;


      int petersInsurancePolicyCost=300 * petersTipper.getAge();
        petersInsurancePolicyCost+= petersTipper.getNumberOfMiles()>80000 ? 700:0;

      //folosire operatori ternari in loc de if
       joesInsurancePolicyCost += joesCar.isDiesel() ? 500:0;
       joesInsurancePolicyCost += joesCar.getNumberOfMiles() > 200000 ?500:0;
        System.out.println("Joe's policy cost is: "+ joesInsurancePolicyCost);
        System.out.println("Steve's policy cost is: "+ stevesInsurancePolicyCost);
        System.out.println("Peter's policy cost is: "+ petersInsurancePolicyCost);

    }
}
