package day06_ifStatements;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
       int num1 = 10;
       int num2 = 15;

       if(num1 < num2){
           System.out.println(num1 + " is the minimum number ");
       }
       if(num1 > num2){
           System.out.println(num2 + " is the minimum number");
       }
       if(num1 == num2){
           System.out.println("They are equal");
       }
    }
}
