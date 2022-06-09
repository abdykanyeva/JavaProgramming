package day16_nestedLOop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("ENter a number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd number");
            }

            System.out.println("Would you like to enter another number? yes/no");
            String yesNo = input.next().toLowerCase();

            while(!(yesNo.equals("yes") || yesNo.equals("no"))){
                System.out.println("Invalid entry! Would you like to enter another number? yes/no");
                yesNo = input.next().toLowerCase();
            }

            if(yesNo.equals("no")){
                break;
            }


        }

    }
}
