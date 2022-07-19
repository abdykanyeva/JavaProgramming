package day41_maps;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4,5 ,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10, 11));



        List<List<Integer>> list = new ArrayList<>();
        //list.addAll(Arrays.asList(list1, list2));
        list.add(list1);
        list.add(list2);

        System.out.println(list);

        System.out.println(list.get(1).get(3));

        for(List<Integer> eachList :list){
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }


        System.out.println("__________________________________");


        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets);

        listOfSets.get(0).addAll(Arrays.asList(10,5,4,20, 5,20));
        listOfSets.get(1).addAll(Arrays.asList(130,15, 30));
        listOfSets.get(2).addAll(Arrays.asList(170,150, 30));
        System.out.println(listOfSets);


         System.out.println(listOfSets.size());

        System.out.println("__________________________________");




        int [] arr1 = {1,2,3,4};
         int [] arr2 = {5,6,7,8,9,10};

         List<int []> listsOfArrays = new ArrayList<>();
         listsOfArrays.add(arr1);
         listsOfArrays.add(arr2);

        System.out.println(listsOfArrays);

         listsOfArrays.get(0)[2]=35;

        System.out.println(  Arrays.toString(listsOfArrays.get(0) ) );









    }
}
