package day21_multidimensionalArrays;

import java.util.Arrays;

public class IteratingMultideminsionalArray {

    public static void main(String[] args) {
        int [][] arr2D = {  {10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100} };
        // index of 1D Array    0             1                      2

     /*   for (int i = 0; i < arr2D.length; i++) {

            int [] each1D = arr2D[i];
            System.out.println(Arrays.toString(each1D));

            for(int j = 0; j < each1D.length; i++){ // j: index number of elements in each one dimensional array

                int eachElement = each1D[j];

                System.out.println(eachElement);

            }
        }

      */
        System.out.println("____________________________________________________");

        for(int[] eachDArray:arr2D){
            System.out.println(Arrays.toString(eachDArray));

            for(int eachElement:eachDArray){
                System.out.println(eachElement);

            }
        }


        System.out.println("________________________________________________________________");










    }
}
