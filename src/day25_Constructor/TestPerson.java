package day25_Constructor;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class TestPerson {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
;

        Person p1 = new Person("Kevin", 'm', LocalDate.of(1998, 12, 20), false, false);
        Person p2 = new Person("Alina", 'f', LocalDate.of(1993, 7, 7), true, false);
        Person p3 = new Person("Adam", 'm', LocalDate.of(1990, 4, 16), false, false);
        Person p4 = new Person("Aleksei", 'm', LocalDate.of(1989, 5, 7), true, true);
        Person p5 = new Person("Lucy", 'f', LocalDate.of(1988, 6, 12), true, false);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);





    }
}
