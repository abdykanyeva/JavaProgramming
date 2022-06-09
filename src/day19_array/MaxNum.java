package day19_array;

public class MaxNum {

    public static void main(String[] args) {

        int [] num = {5, 6, 10, 12};
        int max = num[0];     // assume that the first number is the max number

        for (int i = 1; i < num.length; i++) {  // i: 1, 2, 3, 4, 5
            if(num[i] > max){ // compares the lement of the array with current maximum number
                max = num[i]; // replace the current maximum nuber
            }
        }
        System.out.println(max);


    }
}
