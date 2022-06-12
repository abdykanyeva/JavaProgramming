package day22_arrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayLIstIntro {

    public static void main(String[] args) {

        int [] array = new int[5];

        array[0] = 10;
        array[1] = 20;
        array[2] =40;
        array[3] = 30;
        array [4] = 50;


        System.out.println(Arrays.toString(array));


        System.out.println("__________________________________________________");

        ArrayList <Integer> list = new ArrayList<>();

        System.out.println(list);
        System.out.println(list.size());



    }
}