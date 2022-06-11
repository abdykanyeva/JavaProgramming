package day21_multidimensionalArrays;

import java.util.Arrays;

public class ArrayShop {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} } ;






        for(String []each:items){
            String result ="";
            for(String each1:each){
                result+=each1.replace(",", " ") + "\t";

            }System.out.println(result);
        }
        System.out.println("_________________________________");

        for (int i = 0; i < items.length; i++) {
            String result = "";
            for (int j = items.length; j >= 0; j--){
                result += items[i][j].replace(",", " ") + "\t";
            }
            System.out.println(result);
        }
        System.out.println("___________________________________________________");









    }
}
