package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {


        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if(age < 0 || age > 150){
            if(age < 0) {
                throw new InputMismatchException("Age of the person should not be negative: " + age);
            }else{
                throw new InputMismatchException("Age of the person can not be greater than 150: " + age);
            }
        }

        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        System.out.println("______________________________________________");

        //throw new RuntimeException("Runtime exception");
        // System.out.println("Hello world"); after line 30 program gets terminated, so it's impossible to continue


       // throw new FileNotFoundException("");

        //RuntimeException exception = new RuntimeException();

        //throw  exception;

       // throw new Person("jIMMY", 45, 'M'); // does not have IS-A relationship with "Throwable" class


    }

}
