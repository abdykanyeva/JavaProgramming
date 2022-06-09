package day16_nestedLOop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String u, p;



        do{
            System.out.println("Enter your username:");
            u =input.next();

            System.out.println("Enter your password: ");
            p = input.next();



        }while(!(u.equals("CYdeo") && p.equals("WoodenSpoon")));




    }
}
