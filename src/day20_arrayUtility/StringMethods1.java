package day20_arrayUtility;

import java.util.Arrays;

public class StringMethods1 {

    public static void main(String[] args) {

        String word = "Cydeo School";

        char [] word1 = word.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(word1));


        String sentence = "I love Java";  // Java love I

        String [] sentence1 = sentence.split(" ");
        String [] reversed = new String[sentence1.length];
        String result = "";

        for (int i = sentence1.length - 1, k = 0; i >= 0; i--, k++) {
            reversed[k] = sentence1[i];
            result += reversed[k] + " ";
        }


        System.out.println(result);


    }
}
