package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int [] array = {1, 2, 3,4, 5};
        array[0] = 100;

        System.out.println(Arrays.toString(array));

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("paper towels");
        groceryList.add("Apples");
        groceryList.add("Cooking oil");

        System.out.println(groceryList);

       // groceryList[2] = "Orranges";

        groceryList.set(2, "Oranges");

        System.out.println(groceryList);

        groceryList.add(2, "Chicken");
        System.out.println(groceryList);

        groceryList.remove(0);

        System.out.println(groceryList);
        groceryList.remove("paper towels");

        System.out.println(groceryList);


        System.out.println("____________________________________________________________");

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        boolean r1 = numbers.remove(Integer.valueOf(10));
        System.out.println(r1);

        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);


        System.out.println("__________________________________________________________");


        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeyee");
        names.add("Ali");
        names.add("Sumeyee");

        System.out.println(names.indexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Vasyl"));

        System.out.println(names.lastIndexOf("Sumeyee"));
        
        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("ALi");

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);














    }
}
