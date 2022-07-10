package day36_polymorphism;

import day34_abstraction.car.Car;

public class TestCar {

    public static void main(String[] args) {


        Tesla tesla1 = new Tesla("Model y", "White", 2022, 55555);
        Tesla tesla2 = new Tesla("Model y", "White", 2022, 55555);

        System.out.println(tesla1.equals(tesla2));
    }
}
