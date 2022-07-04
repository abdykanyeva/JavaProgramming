package day33_abstraction.employee;

public class TestEmployee {

    public static void main(String[] args) {


        // We can not create object from an abstract class, Object MUST be created from a concrete class.


        Teacher teacher = new Teacher("Lucy", 45, 'F', "A01", "MAth Teacher", 75000);


        Developer developer = new Developer("James", 30, 'M', "C1", "jAVA dEVELOPER", 950000, "Java");


        Driver driver = new Driver("Aaron", 48, 'M', "d1", "Truck Driver", 90000);

        Tester tester = new Tester("Emily", 35, 'F', "F12", "sdet", 80000);


        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);


    }

}
