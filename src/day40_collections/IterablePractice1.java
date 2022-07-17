package day40_collections;

import java.sql.Array;
import java.util.*;

public class IterablePractice1 {

    public static void main(String[] args) {



        ArrayList<Integer> list = new ArrayList<>();

        Iterator<Integer> iterator = list.iterator();

        System.out.println(iterator.hasNext());

        System.out.println("_____________________________________");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String each = it.next();
            if(each.equalsIgnoreCase("Ahmed")){
                it.remove();
            }
        }
        System.out.println(names);


        System.out.println("_____________________________________");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names2.removeIf(p -> p.equalsIgnoreCase("Ahmed"));
        System.out.println(names2);



        List<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,34,5,1,2,3,4,5,6,7,8,8,9,9,9,9,10));

        // find the nth largest number


        int n = 5;

        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }

        int max1 = Collections.max(numbers);
        System.out.println(max1);








    }
}
