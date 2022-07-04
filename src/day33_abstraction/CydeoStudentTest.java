package day33_abstraction;

import java.time.LocalDate;

public class CydeoStudentTest {

    public static void main(String[] args) {
        CydeoStudent  student1 = new CydeoStudent("Daniel", 'M',
                LocalDate.of(1989, 11, 1), "A1", "ZERO TO HERO", 1);

        System.out.println(student1);
        
        student1.eat();
        student1.drink();
        student1.breath();;



    }
}
