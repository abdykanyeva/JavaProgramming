package day06_ifStatements;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your numbers:" );
        int number = input.nextInt();
        if(number > 0){
            System.out.println("Positive");
        }
        else if(number < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
