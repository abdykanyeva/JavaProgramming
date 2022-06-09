package day11_StringCont;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first word:");
        String str1 = input.nextLine();
        System.out.println("Enter the second word: ");
        String str2 = input.nextLine();


        if(str1.length() == str2.length()){
            System.out.println("Equal");
        }else if(str1.length() > str2.length()){
            System.out.println(str1 + " is the longest string");
        }else if(str1.length() < str2.length()){
            System.out.println(str2+ " is the longest string");
        }else{
            System.out.println("not equal");
        }
        input.close();







    }
}
