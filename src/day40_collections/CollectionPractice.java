package day40_collections;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add((100));
        collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700));

        System.out.println(collection);

        System.out.println(((ArrayList)collection).get(2));

       Collection<Integer> collection2 = new HashSet<>();
       collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 100));

        System.out.println(collection2);

        System.out.println(new ArrayList<>(collection2).get(4));


    }
}
