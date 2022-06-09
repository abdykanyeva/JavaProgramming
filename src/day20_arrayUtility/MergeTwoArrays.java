package day20_arrayUtility;

import java.util.Arrays;
import utilities.ArraysUtility;

public class MergeTwoArrays {

    public static void main(String[] args) {


        int [] arr1 = {1, 2, 3, 4};
        int [] arr2 = {5, 6, 7};

        int [] arr4 = ArraysUtility.merge(arr1, arr2);
        System.out.println(Arrays.toString(arr4));

        int [] arr3 = new int[arr1.length + arr2.length];  // to make sure that 3rd array have enough capacity to contain all the elements of array1 and array2


        int k = 0; // for third array index numbers

        for (int i = 0; i < arr1.length; i++, k++) { // i: for first array's index numbers
            arr3[k] = arr1[i];


        }
        for (int i = 0; i < arr2.length; i++, k++) { // i: for second array's index numbers
            arr3[k] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));


        String [] names = {"Adelina"};
        String [] names1 = {"Tilek"};

        String [] namesTotal = ArraysUtility.merge(names, names1);

        System.out.println(Arrays.toString(namesTotal));







    }
}
