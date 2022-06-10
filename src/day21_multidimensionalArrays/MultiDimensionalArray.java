package day21_multidimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int [][] arr2D1 = {{1, 2}, {3, 4, 5}};
        int [][] arr2D2 = {{6, 7, 8, 9}, {10, 11, 12, 13}};
        int [][] arr2D3 = {{1, 2}};


        int [][][] arr3D= { {{1, 2}, {3, 4, 5}}, {{6, 7, 8, 9}, {10, 11, 12, 13, 14}}, {{1, 2}} }; // index : 0~2
        // index:                   0                             1                     2

        // [index of 2d array][index of 1d array][index of elements]

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[0][1]));
        System.out.println(arr3D[1][1][4]);


        System.out.println("___________________________________________");

        for (int i = 0; i < arr3D.length; i++) { // i: index number of each 2 dimensional array

            int [][] each2DArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2DArray));

            for (int j = 0; j < each2DArray.length; j++) { // j: index number of each 1 dimensional array
                int [] each1DArray = each2DArray[i];
                System.out.println(Arrays.toString(each1DArray));

                for (int k = 0; k < each1DArray.length; k++) { // k: index number of each element
                    int eachElement = each1DArray[i];
                    System.out.println(eachElement);

                }


            }

        }

    }
}
