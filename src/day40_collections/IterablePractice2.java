package day40_collections;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));


        Iterator<String> list = names.iterator();

        while(list.hasNext()){
            String each = list.next();
            if(each.equalsIgnoreCase("ahmed")){
                list.remove();
            }
        }
        System.out.println(names);
        System.out.println("__________________________________");


        names.removeIf(p -> p.equalsIgnoreCase("ahmed"));
        System.out.println(names);
        System.out.println("__________________________________");

        for (Iterator<String> i = names.iterator(); i.hasNext();) {
            String each = i.next();
            if (each.equalsIgnoreCase("ahmed")){
                i.remove();
            }
        }
        System.out.println(names);
        System.out.println("__________________________________");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        int n = 5;

        for (int i = 0; i < n - 1; i++) {
            numbers.removeIf(p -> Collections.max(numbers) == p);
        }
        System.out.println(Collections.max(numbers));

        System.out.println("__________________________________");

        List<String> names1 = new ArrayList<>();
        names1.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        Iterator<String> it = names1.iterator();

        while (it.hasNext()){
            String each = it.next();

            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);

            }
            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }

        }
        System.out.println(names1);

        List<String> names3 = new ArrayList<>();
        names3.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        names3.removeIf(p-> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p));

        System.out.println(names3);


    }
}
