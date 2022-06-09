package day11_StringCont;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();

        if(word.length() >= 1){
            char ch = word.charAt(0);
            if(ch >= 48 && ch <= 57){
                System.out.println("");
            }

        }else{
            System.out.println("String is empty");
        }


    }
}
