package day20_arrayUtility;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Reversed {

    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5};

        int [] reverse = new int[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("________________________________________");

        int [] nums = {100, 200, 300, 400, 500};
        nums = ArraysUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("_____________________________________________________");


        double [] a1 = {1.5, 2.7, 3.8};

        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));

    }
}
