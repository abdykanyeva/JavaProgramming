package day42_maps;

import day26_statics.Employee;

import java.sql.Array;
import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5 ,6));

        List<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11));

        List<List<Integer>> list = new ArrayList<>();
        list.addAll(Arrays.asList(list1, list2));

        System.out.println(list);

        System.out.println("_______________________________________");

       // List<int [][]> l = new ArrayList<>();

        System.out.println(list.get(1).get(3));

       for(List<Integer> eachList : list){
           for(Integer eachElement: eachList){
               System.out.println(eachElement);
           }
       }
        System.out.println("_______________________________________");

       List<Set<Integer>> listOfSets = new ArrayList<>();
       listOfSets.add(new LinkedHashSet<>());
       listOfSets.add(new LinkedHashSet<>());
       listOfSets.add(new LinkedHashSet<>());
       listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets);

        // {10, 5, 20}

        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        listOfSets.get(1).addAll(Arrays.asList(30,15, 30));
        listOfSets.get(2).addAll(Arrays.asList(17, 16, 15));
        listOfSets.get(3).addAll(Arrays.asList(3000, 1, 5));


        System.out.println(listOfSets);

        System.out.println("_______________________________________");

        List<int[]> listOfArrays = new ArrayList<>();

        int [] arr1 = {1, 2, 3, 4};
        int [] arr2 = {5, 6, 7, 8, 9, 10};

        listOfArrays.add(arr1);
        listOfArrays.add(arr2);
        listOfArrays.get(0)[2] = 35;
        System.out.println( Arrays.toString(listOfArrays.get(0)));


        System.out.println("_______________________________________");

        List<List<Employee>> teams = new ArrayList<>();




    }
}
