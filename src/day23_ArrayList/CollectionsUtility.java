package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3,4, 5, 6, 7,1, 2, 3,4, 5, 6, 7, 8));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);


        System.out.println("________________________________________________________________________________________");

        ArrayList<String>items = new ArrayList<>();
        items.addAll(Arrays.asList("Eggs", "Potato", "Milk"));
        Collections.sort(items);

        System.out.println(items);


        System.out.println("_________________________________");

        Collections.reverse(items);

        System.out.println(items);


        System.out.println("_______________________________________________________");

        ArrayList<String> name = new ArrayList<>();
        name.addAll(Arrays.asList("GAdir", "Hasan", "Aidullah", "Bilal"));

        Collections.swap(name, 0, 1);
        System.out.println(name);

        Collections.swap(name, 0, name.size() - 1);
        System.out.println(name);




    }
}
