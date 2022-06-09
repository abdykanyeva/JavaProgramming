package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        while(!(age >=0 && age < 120)){
            System.out.println("Invalid entry");
            age = input.nextInt();
        }



    }
}
