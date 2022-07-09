package day35_polymorphism;

import day27_accessModifier.Circle;
import day29_inheritance.carTask.Honda;
import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.Car;
import day35_polymorphism.transportationTask.Tesla;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {


        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;




       Animal [] animals = {dog, cat, tiger, eagle, lion};


        System.out.println("____________________________________________");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Object[] objects = {str, n, r, d, circle};
        System.out.println(Arrays.toString(objects));

        System.out.println("________________________________________________");


        Car tesla = new Tesla("Tesla", "Model y","White", 2022, 55000);

        tesla.start();
        tesla.stop();

        Animal tiger1 = new Tiger("Simba", "Aktai", 'F', 5, "Big", "Yellow");

        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        //tiger1.hunt();



    }
}
