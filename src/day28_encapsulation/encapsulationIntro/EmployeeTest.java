package day28_encapsulation.encapsulationIntro;

public class EmployeeTest {

    public static void main(String[] args) {
/*
        Employee employee1 = new Employee();

        employee1.setSalary(10000);

        System.out.println(employee1.getSalary());

        employee1.setName("      ");
        System.out.println(employee1.getName());

*/
        Employee employee1 = new Employee("Khashayr", 34, "Java Developer", 10000);

        System.out.println(employee1);

    }



}
