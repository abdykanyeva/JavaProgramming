package day09_scanner;

import java.util.Scanner;

public class EligiblleOrNot {
    public static void main(String[] args) {
        System.out.println("Please enter your age: ");
        int age = new Scanner(System.in).nextInt();
        String result;

        if(age >= 21){
            result = "Eligible to buy alcohol";
        }else{
            result = "Not eligible";
        }
        System.out.println(result);

    }
}
