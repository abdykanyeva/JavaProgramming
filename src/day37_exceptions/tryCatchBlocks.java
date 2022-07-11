package day37_exceptions;

import java.util.Locale;

public class tryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program started");

        try{
            System.out.println(9 / 0);  // Arithmetic exception

        }catch(ArithmeticException e){
            System.out.println("Catcch block");

        }

        System.out.println("Program ended");


        System.out.println("___________________________________");

        System.out.println("Program 2 started");

        String str = null;

        try{
            System.out.println(str.toLowerCase());
            System.out.println("Try Block");

        }catch(RuntimeException e){
            System.out.println("Catch block");
        }

        System.out.println("Program 2 ended");


        System.out.println("___________________________________");

        System.out.println("Program 3 started");


        try{
            Thread.sleep(3000);
            System.out.println("Try block");
        }catch(InterruptedException e){
            System.out.println("Catch Block");
        }


        System.out.println("Program 3 ended");




    }
}
