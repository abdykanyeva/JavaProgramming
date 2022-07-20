package day42_maps;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {



        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5 ,6));

        List<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11));

        List<Integer>list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(80, 90, 60, 70));


        List<Integer> [] arrayOfLists = new List[3];

        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;

        arrayOfLists[0].set(4, 15);

        System.out.println(Arrays.toString(arrayOfLists));

        Set<Integer> [] arrayOfSets = new Set[5];
        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new LinkedHashSet<>();

        arrayOfSets[2].addAll(Arrays.asList(1, 2, 3, 4, 5));



        System.out.println(Arrays.toString(arrayOfSets));

    }

}
