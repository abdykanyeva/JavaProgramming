package day36_polymorphism.practiceTask;

import day34_abstraction.car.Audi;
import day34_abstraction.car.Car;
import day34_abstraction.car.Honda;
import day34_abstraction.car.Tesla;

import java.util.ArrayList;
import java.util.Arrays;


public class CarTask {

    public static void main(String[] args) {
        Car[] cars = {
                new Honda("Pilot","White", 2010, 25000),
                new Audi("Q6", "Red",2014, 32000),
                new Honda("Accord", "White",2011, 20000  ),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black",2019, 35000),
                new Audi("Q8", "White",2018, 40000),
                new Audi("Q5", "Purple",2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red",2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue",2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue",2014, 48000),
        };

        for(Car eachCar: cars){
            if(eachCar instanceof Honda ){
                if(eachCar.getYear() >= 2010 && eachCar.getYear() <= 2011){
                    System.out.println(eachCar);
                }

            }
            if(eachCar instanceof Audi){
                if(eachCar.getYear() >= 2015 && eachCar.getYear() <= 2019){
                    System.out.println(eachCar);
                }
            }
            if(eachCar instanceof Tesla){
                if(eachCar.getYear() >= 2015 && eachCar.getYear() <= 2016){
                    System.out.println(eachCar);
                }
            }
        }

        double highestPrice = cars[0].getPrice();
        double lowestPrice = cars[0].getPrice();


        for(Car eachCar: cars){
            if(eachCar.getPrice() > highestPrice){
                highestPrice = eachCar.getPrice();

            }
            if(eachCar.getPrice() < lowestPrice){
                lowestPrice = eachCar.getPrice();
            }

        }
        System.out.println(  highestPrice);
        System.out.println(lowestPrice);

        ArrayList<Tesla> teslaCars = new ArrayList<>();

        for (Car car : cars) {
            if(car instanceof Tesla){
                teslaCars.add((Tesla) car);
            }

        }
        System.out.println(teslaCars);



    }
}
