package day09_scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Please enter your number: ");
        int number = new Scanner(System.in).nextInt();

        String result = (number % 2 == 0)?"Even" :"Odd";
        System.out.println(result);
    }
}
