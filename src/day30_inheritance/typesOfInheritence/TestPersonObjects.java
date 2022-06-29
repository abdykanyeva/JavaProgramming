package day30_inheritance.typesOfInheritence;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TestPersonObjects {

    public static void main(String[] args) {

        Student student = new Student("Lucy", 'F', LocalDate.of(1990, 5, 16), 'A', "A05");

        President president = new President("Daniel", 'M', LocalDate.of(1980, 11, 25), LocalDate.of(2020, 7, 15));

        Teacher teacher = new Teacher("Emily", 'F', LocalDate.of(1985, 11, 1), "Math Teacher","A09" , 95000);



        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

        student.study();
        teacher.teach();
        president.lie();


        System.out.println("________________________________________________");
        
        
        student.eat("baklava");
        teacher.eat("Kebab");
        president.drink("Coffee");

    }
}
