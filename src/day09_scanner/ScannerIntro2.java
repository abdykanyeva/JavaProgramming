package day09_scanner;

import java.util.Scanner;

public class ScannerIntro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(("Would you like to continue?"));
        String answer = input.next();
        System.out.println("You have entered :" + answer);

        System.out.println("_____________________________________________________________");

        input.close();

    }
}
