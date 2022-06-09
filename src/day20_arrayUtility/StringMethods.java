package day20_arrayUtility;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";
        char [] ch = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("______________________________________________________");


        String str2 = "Today is a great day to learn Java";

        String [] words = str2.split(" , ");

        System.out.println(Arrays.toString(words));


        System.out.println("_______________________________________________");

        String sentence = "I love Java";



    }
}
