package day29_inheritance.encapsulation;

import day29_inheritance.encapsulation.Encapsulation;

public class EncapsulationTest {

    public static void main(String[] args) {

        Encapsulation student1 = new Encapsulation("Hamza", 28, 'M', 'A', "MIT");
        System.out.println(student1);
        student1.setSchoolName("Harvard");

        student1.setGrade('B');
        System.out.println(student1);

    }
}
