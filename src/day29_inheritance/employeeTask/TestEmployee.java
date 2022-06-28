package day29_inheritance.employeeTask;

public class TestEmployee {


    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.setInfo("Hilal", 'F', 26, "A07", "Tester", 90000);

        System.out.println(tester);
        tester.testing();

        Developer developer = new Developer();
        developer.setInfo("Alex", 'M', 33, "A08", "Developer", 140000);

        System.out.println(developer);
        developer.setProgrammingLanguage("Java");
        System.out.println(developer.getProgrammingLanguage());


        Teacher teacher = new Teacher();
        teacher.setInfo("Urmat", 'M', 28, "A09", "Teacher", 90000);
        System.out.println(teacher);
        teacher.teaching();


        Driver driver = new Driver();
        driver.driving();

    }


}
