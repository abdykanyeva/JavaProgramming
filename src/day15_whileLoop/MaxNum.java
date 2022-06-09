package day15_whileLoop;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -2147483648;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a number: ");
            int res = input.nextInt();
            if (res > max) {
                max = res;
            }
            System.out.println("Maximum: " + max);

            input.close();
        }
    }
}
