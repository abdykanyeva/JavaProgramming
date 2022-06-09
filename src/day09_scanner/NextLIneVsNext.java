package day09_scanner;

import java.util.Scanner;

public class NextLIneVsNext {
    public static void main(String[] args) {
        // nexxt line will have an extra issue if it will be used after
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        System.out.println("Enter your age: ");

        System.out.println("Fullname: ");
        String fullName = input.nextLine();

        System.out.println(age);
        System.out.println("fullName = " + fullName);


    }
}
