package day30_inheritance.typesOfInheritence;

import java.time.LocalDate;


public class TestPersonObjects {

    public static void main(String[] args) {


        Student student = new Student("Suzan",'F',LocalDate.of(2000, 7, 5), 'A', "07");
        System.out.println(student);



    }
}