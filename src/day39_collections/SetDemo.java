package day39_collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 90, 10));
        list.addAll(Arrays.asList(10, 20, 30, 90, 10));
        list.addAll(Arrays.asList(10, 20, 30, 90, 10));

        System.out.println(list);


        System.out.println("_---_________________");

        Set<Integer> set1 = new HashSet<>(); // order is random
        set1.addAll(Arrays.asList(10, 20, 30, 90, 10));
        set1.addAll(Arrays.asList(10, 20, 30, 90, 10));
        set1.addAll(Arrays.asList(10, 20, 30, 90, 10));
        set1.addAll(Arrays.asList(null, null, null));

        System.out.println(set1);

        System.out.println("_---_________________");

        Set<Integer> set2 = new LinkedHashSet<>(); // order is random
        set2.addAll(Arrays.asList(10, 20, 30, 90, 10));
        set2.addAll(Arrays.asList(10, 20, 30, 90, 10));
        set2.addAll(Arrays.asList(10, 20, 30, 90, 10));
        set2.addAll(Arrays.asList(null, null, null));


        System.out.println(set2);


        System.out.println("_---_________________");


        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10, 20, 30, 90, 10));
        set3.addAll(Arrays.asList(10, 20, 30, 90, 10));
        set3.addAll(Arrays.asList(10, 20, 30, 90, 10));
        //set3.addAll(Arrays.asList(null, null, null));

        System.out.println(set3);




    }
}
