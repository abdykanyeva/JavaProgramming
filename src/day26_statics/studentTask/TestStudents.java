package day26_statics.studentTask;

import org.w3c.dom.ls.LSOutput;

public class TestStudents {
    public static void main(String[] args) {


    Student student1 = new Student("Yusuf", 21, 'm', "A16");
    Student student2 = new Student("Yusuf", 21, 'm', "B34");
    Student student3 = new Student("Yusuf", 21, 'm', "C27");
    Student student4 = new Student("Yusuf", 21, 'm', "D43");
    Student student5 = new Student("Yusuf", 21, 'm', "E55");

    Student[] students = {student1, student2, student3, student4, student5};

    StudentsGroup group1 = new StudentsGroup(01, "JAva Turtles");
    group1.addStudent(students);

        System.out.println(group1);

        group1.removeStudent("D43");
        group1.removeStudent("E47");

        System.out.println(group1);


        for(Student each :group1.students){
            System.out.println(each.name + ":" + each.id);
        }


    }
}
/*
Create a class named TestObjects
            3.1 Create 5 Student objects
            3.2 Create a StudentGroup object
            3.3 Add all the student objets to the StudentsGroup object' students list
 */