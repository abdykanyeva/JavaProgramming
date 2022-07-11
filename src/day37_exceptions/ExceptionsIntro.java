package day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {


        String str = "Java";

       // char ch = str.charAt(250);  // unchecked exceptions

       // System.out.println(ch);


       // Pizza pizza = null;  // unchecked exception

       // pizza.totalCost();

       // System.out.println(50/0); // unchecked exception

        System.out.println("Hello World");


        int grade = 100;

        if(grade > 59){
            System.out.println("Your score is D");
        }else if(grade > 70){
            System.out.println("Your grade is C");
        }

        System.out.println("_____________________________");


       // FileInputStream FILE = new FileInputStream(""); // checked exception, program does not compile

       // Thread.sleep(3000);




    }
}
