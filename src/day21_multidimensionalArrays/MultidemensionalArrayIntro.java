package day21_multidimensionalArrays;

import java.util.Arrays;

public class MultidemensionalArrayIntro {

    public static void main(String[] args) {

        int [] arr1 = {10, 20, 30};
        int [] arr2 = {40, 50, 60, 70, 80};
        int [] arr3 = {90, 100};
        int [] arr4 = {1000, 2000};


        System.out.println("__________________________________________________");


        int [][] arr2D = {  {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100},  {1000, 2000} }; // index: 0 ~ 2
        //         index:      0                 1                  2           3

        System.out.println(arr2D.length);

        System.out.println("arr2D[1] = " + Arrays.toString(arr2D[1]));

        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][0]);
        System.out.println(arr2D[1][2]);

    }

}
