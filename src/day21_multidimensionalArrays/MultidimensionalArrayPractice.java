package day21_multidimensionalArrays;

import java.util.Arrays;

public class MultidimensionalArrayPractice {
    public static void main(String[] args) {
        String[] group1 = {"Beyza M Ertan", "Ahmet Polat", "Baturay Gok", "Igor Pojar"};  // 4
        String[] group2 = {"Hasan Can", "Hira Ferda", "Hamza Sardar"};  // 3
        String[] group3 = {"Entisar Ermobolat", "Kadifa Kudic", "Kramer Brown", "Shukur Altay", "Violetta"};  // 5
        String[] group4 = {"Lucy Gaid", "Madina Rasullu"};  // 2


        String [][] groups = {group1, group2, group3, group4};
/*
        for (int i = 0; i < groups.length; i++) {
            System.out.println(Arrays.toString(groups[i]));

            for (int j = 0; j < groups[i].length; j++) {
                System.out.println(groups[i][j]);
            }



        }

 */

        for(String [] each: groups){
            System.out.println(Arrays.toString(each));
            for(String eachElement: each){
                System.out.println(eachElement);
            }
        }
        System.out.println("________________________________________________________");


        for (int i = groups.length - 1; i >= 0; i--) {
            String []eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for(String eachStudent: eachGroup){
                System.out.println(eachStudent);
            }
        }


        System.out.println(groups);

        System.out.println(Arrays.toString(groups)); // to String only for Single Dimensional Arrays

        System.out.println(Arrays.deepToString(groups)); // deepToString ==> only for multidemensional Arrays

    }

}
