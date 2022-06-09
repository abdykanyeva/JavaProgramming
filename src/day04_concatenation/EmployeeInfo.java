package day04_concatenation;

public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "Adelina",
                gender = "Female",
                companyName = "Google Inc",
                jobTitle = "Software Developer";
        int age = 25,
                salary = 170_000;
        System.out.println(name + " is " + age + " years old, gender is " + gender + ".\n" +
                name + " works at " + companyName + " as a " + jobTitle + ".\n" +
                name + " makes $" + salary + " per year." );




    }




}
