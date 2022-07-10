package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phone.Nokia;
import day30_inheritance.phone.Phone;
import day33_abstraction.employee.Developer;
import day33_abstraction.employee.Employee;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        // Dog dog = new Dog();

        // Cat cat = new Dog(); can not assign


        Animal animal = (Animal)new Dog(); // implicit casting: upcasting  -> casting sub type to super type

        // Downcasting: casting the super type to sub type (DONE EXPLICITLY)



        // upcasting: casting the sub type to super type (done implicitly)

       // Car car = new BMW();

        Animal animal1 = new Dog();  // upcasting ==> polymorphism
        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ((Dog)animal1).bark(); // down casting

        /*Dog dog1 = (Dog)animal1;  // Casting happens only if there are "IS-A" relationship between two classes
        dog1.bark();

         */

        Animal animal2 = new Cat();

        ((Cat)animal2).scratch();

        Cat cat1 = (Cat)animal2;
        cat1.scratch();

        System.out.println("_________________________________");

        Phone phone = new Nokia("xr20", "Small", 350, "Black");
        phone.call(911);
        phone.text(123456);

        ((Nokia)phone).selfDefence();

      //  ((Iphone).faceTime(12344567)) Nokia can not be converted to Iphone, because there is not "IS-A" relationship between Nokia and iPHONE ==> Class cast exception
        System.out.println("_________________________________");

        Employee employee = new Developer("James", 30, 'M', "C1", "jAVA dEVELOPER", 950000, "Java");

        employee.work();
        System.out.println(((Developer)employee).getProgrammingLanguage());



    }
}
