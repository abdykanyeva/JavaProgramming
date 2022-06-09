package day06_ifStatements;

import java.util.Scanner;

public class Cigarettes {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Please enter your age: ");

        int input = age.nextInt();

        if(input <= 20){
            System.out.println("You are not eligible to buy Cigarettes!");
        }
        else{
            System.out.println("You can buy cigarettes:(");
        }
    }
}
