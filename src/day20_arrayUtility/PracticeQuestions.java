package day20_arrayUtility;

import java.util.Arrays;

public class PracticeQuestions {
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5};
        int [] arrayChanged = new int [array.length];

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                arrayChanged[i] = array[i] *= 2;
            }
            else{
                arrayChanged[i] = array[i];
            }

        }
        System.out.println(Arrays.toString(arrayChanged));




        // task 2

        int [] arr1 = {1, 2, 3, 4, 5};

        int [] reversedArray = new int [arr1.length];


        for (int i = arr1.length - 1; i >= 0; i--) {

        }

    }




}
