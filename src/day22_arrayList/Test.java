package day22_arrayList;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90};

        boolean res = ArraysUtility.contains(numbers, 25);
        System.out.println(res);


        System.out.println("__________________________________________________________");

        String[] students = {"Sumeye", "HAmza"};

        boolean result = ArraysUtility.contains(students, "Kashayar");
        System.out.println(result);


        System.out.println("_______________________________________________________________");


    }
}