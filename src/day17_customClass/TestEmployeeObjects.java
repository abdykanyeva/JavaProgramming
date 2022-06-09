package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Askar", 27, 'm', "Software engineering", 200000, "A17");

        Employee employee2 = new Employee();
        employee2.setInfo("Adelina", 25, 'f', "Software Engineering", 180000, "G17");


        System.out.println(employee1);
        System.out.println(employee2);

        employee1.work();

    }
}
