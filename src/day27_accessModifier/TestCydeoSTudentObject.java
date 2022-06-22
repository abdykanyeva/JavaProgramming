package day27_accessModifier;

public class TestCydeoSTudentObject {

    public static void main(String[] args) {
        System.out.println(CydeoStudent.schoolName);
        CydeoStudent student1 = new CydeoStudent("Ekaterina", 29, 'f');
        CydeoStudent student2 = new CydeoStudent("Alena", 28, 'f');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);

    }
}
