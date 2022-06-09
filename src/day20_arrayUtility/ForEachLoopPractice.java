package day20_arrayUtility;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int each : numbers){
            if(each%2 != 0){
                System.out.println(each);
            }
        }

        System.out.println("___________________________________________________");

        int [] nums = {10, 20, 30, 40, 50, 60, 70, 4, 1, 800};


        int max = numbers[0];
        int min = nums[0];

        for(int each: nums){
            if(max < each){
                max = each;

            }
            if(each < min){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);



        int [] a1 = {10, 20, 30, 40, 50, 60, 70};
        int [] a2 = {50, 40, 70, 80};

        int [] a3 = new int [a1.length + a2.length];

        int k = 0;

        for(int each: a1){
            a3[k++] = each;
        }

        for (int each : a2) {
            a3[k++] = each;

        }
        System.out.println(Arrays.toString(a3));

        System.out.println("____________________________________________________________");



        String [] names = {"Mohammad Karimi", " Vasyl Dobrianski", "Gadir Ibrahimov"};

        for(String each : names){
           // if(each.charAt(0) + "-" + each.charAt(each.lastIndexOf(" ") + 1) ){
                System.out.println(each);
            }
        }










    }

//}
