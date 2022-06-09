package day19_array;

import java.util.Arrays;

public class NUmbers {

    public static void main(String[] args) {


        int [] num = new int[100];

        for (int i = 0; i < num.length; i++) {
            num[i] = i +1;
        }
        System.out.println(Arrays.toString(num));

        int [] num1 = new int[100];

        for (int i = num1.length - 1; i >= 0; i--) {
            num1[i] = 100 - i;
        }
        System.out.println(Arrays.toString(num1));




    }
}
