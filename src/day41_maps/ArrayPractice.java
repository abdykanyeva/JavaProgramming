package day41_maps;

import java.util.*;

public class ArrayPractice {


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4,5 ,6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10, 11));


        List<Integer>[] arrayOfLists = new List[2];

        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;

        arrayOfLists[0].set(4, 50) ;

        System.out.println(Arrays.toString(arrayOfLists));

        Set<Integer> []setOfArrays = new Set[2];

        setOfArrays[0] = new LinkedHashSet<>();
        setOfArrays[1] = new LinkedHashSet<>();
        setOfArrays[2] = new LinkedHashSet<>();
        setOfArrays[3] = new LinkedHashSet<>();
        setOfArrays[4] = new LinkedHashSet<>();


        System.out.println(Arrays.toString(setOfArrays));

        setOfArrays[2].addAll(Arrays.asList(1,2,3,4));


    }
}
