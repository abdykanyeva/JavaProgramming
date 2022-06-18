package day25_Constructor;

import java.time.LocalDate;

public class TestEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ali", 32, 'm', "Java Developer", 95000, LocalDate.of(2022, 12, 2));

        System.out.println(e1);






    }
}
