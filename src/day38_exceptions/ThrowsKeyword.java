package day38_exceptions;


import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("Program 1 started");

        // System.out.println(100/0);
        Thread.sleep(5000);

        System.out.println("Program 1 ended");


        // FileInputStream file = new FileInputStream("gh");
        System.out.println("Program 3 ended");


    }
}


/*

throws keyword: used for handling checked exceptions ONLY, fastest, shortest, temporary way to handle

                caller of the method will be responsible for handling the exception


 */