package day39_collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();  // accepts duplicates, keeps insertion order, has index
        list.addAll(Arrays.asList(10, 20, 30, 90, 10));
        list.addAll(Arrays.asList(10, 20, 30, 90, 10));
        list.addAll(Arrays.asList(10, 20, 30, 90, 10));

        System.out.println(list);


        System.out.println("_---_________________");

        Set<Integer> set1 = new HashSet<>(); // order is random, accepts null key
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


        Set<Integer> set3 = new TreeSet<>();  // keeps the sorted order and does not accept duplicates
        set3.addAll(Arrays.asList(10, 20, 30, 90, 10));
        set3.addAll(Arrays.asList(10, 20, 30, 90, 10));
        set3.addAll(Arrays.asList(10, 20, 30, 90, 10));
        //set3.addAll(Arrays.asList(null, null, null));

        System.out.println(set3);

        String [] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C++", "Ruby", "C#","C#"};

        Set<String> result = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(result);


        words = result.toArray(new String[0]);  //converting set to Array
        System.out.println("Array words: " + Arrays.toString(words));

      /*  for(String each : result){
            System.out.println(each);
        }

       */
        System.out.println(new ArrayList<>(result).get(1));

        System.out.println("_---_________________");


        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 20, 20, 20, 20, 30, 30 , 10, 40, 50, 50, 50, 50));

        Set<Integer> list1 = new TreeSet<>(numbers);
        System.out.println(list1);




    }
}
