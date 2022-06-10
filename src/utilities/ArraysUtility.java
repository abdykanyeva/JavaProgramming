package utilities;

import java.util.Arrays;

public class ArraysUtility {


    public static int [] merge(int[] arr1, int [] arr2 ){

        int [] array3 = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            array3[k] = arr1[i];


        }
        for (int i = 0; i < arr2.length; i++, k++) {
            array3[k] = arr2[i];
        }
        return array3;

    }


    public static String [] merge(String [] array1, String [] array2){

        String [] array3 = new String[array1.length + array2.length];

        int k = 0;
        for (int i = 0; i < array1.length; i++, k++) {
            array3[k] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[k] = array2[i];

        }
        return array3;
        
        

    }


    public static double [] merge(double [] array1, double [] array2) {

        double[] array3 = new double[array1.length + array2.length];

        int k = 0;
        for (int i = 0; i < array1.length; i++, k++) {
            array3[k] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[k] = array2[i];

        }
        return array3;

    }


    public static int [] reverse(int[] array){
        int [] reverse = new int[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static double [] reverse(double [] array){
        double [] reverse = new double[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }



    public static int [] addElements(int [] array, int element){

        int [] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;

    }







}
