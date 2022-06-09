package day19_array;

import java.util.Scanner;

public class MinNum {

    public static void main(String[] args) {
        int [] num = {6, 7, 4, 1};


        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if(num[i] < min){    // 7<6
                min = num[i];
            }
        }
        System.out.println(min);

    }
}
