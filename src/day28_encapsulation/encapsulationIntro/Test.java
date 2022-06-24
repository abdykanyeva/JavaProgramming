package day28_encapsulation.encapsulationIntro;

public class Test {

    public static void main(String[] args) {


        Student student = new Student();

        student.setAge(28);

        System.out.println(student.getAge());

        System.out.println("Test COmpleted");

        student.setName("Aaron");

        System.out.println(student.getName());


    }
}
