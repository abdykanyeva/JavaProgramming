package day28_encapsulation.encapsulationIntro;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person("Adelina", 25, 'F',  LocalDate.of(1997, 4, 16));
        System.out.println(person1);
    }
}
