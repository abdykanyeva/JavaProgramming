package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        Person [] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel", 'm', LocalDate.of(1989, 2, 25));
        people[1].setInfo("John", 'm', LocalDate.of(1989, 2, 25));
        people[2].setInfo("Vera", 'm', LocalDate.of(1989, 2, 25));
        people[3].setInfo("Ali", 'm', LocalDate.of(1989, 2, 25));
        people[4].setInfo("Rosalin", 'm', LocalDate.of(1989, 2, 25));

        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));

        // print name & date of birth of each person object

        for (Person each: studentList) {
            System.out.println(each.name + ":" + each.dateOfBirth);
        }



        // remove students whose age is greater than 55

        studentList.removeIf(p -> p.age > 55 );
        System.out.println(studentList);








    }
}
