package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        // Dog dog = new Dog();

        // Cat cat = new Dog(); can not assign


        Animal animal = (Animal)new Dog(); // implicit casting: upcasting  -> casting sub type to super type






    }
}
