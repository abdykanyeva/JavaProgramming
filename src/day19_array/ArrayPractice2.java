package day19_array;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int [] arr1 = new int[100];



        for (int i = 0, j = 1; i < arr1.length; i++, j++) {
            arr1[i] = j;
        } System.out.println("arr1 = " + Arrays.toString(arr1));

    }
}
