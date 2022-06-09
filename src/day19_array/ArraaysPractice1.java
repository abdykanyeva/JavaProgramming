package day19_array;

import java.util.Arrays;

public class ArraaysPractice1 {

    public static void main(String[] args) {

        // String [] names = {"Adelina", "Entisar", "Shukur", "Kramer", "Violetta"};

        String [] myGroup = new String [5];

        myGroup[0] = "Gulchin";
        myGroup[myGroup.length - 1] = "Asyl";
        myGroup[2] = "sUMEYEE";
        myGroup[1] = "Abidullah";
        myGroup[3] = "Khashayar";


        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Kuzzat";
        System.out.println(Arrays.toString(myGroup));

        System.out.println("____________________________________________________________");

        for (int i = 0; i < myGroup.length; i++) {
            System.out.println(myGroup[i]);
        }

        System.out.println("_______________________________________________");

       int [] num1 = new int[100];

        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);

        }


    }
}
