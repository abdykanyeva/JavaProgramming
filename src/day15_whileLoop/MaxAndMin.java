package day15_whileLoop;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int max = -2147483647; // any integer number that user enters will always be greater than -2147483647
        int min =  2147483647; // any integer number that user enters will always be less than 2147483647

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your number: ");
            int num = input.nextInt();

            if(num > max){
                max = num;
            }

            if(num < min){
                min = num;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
