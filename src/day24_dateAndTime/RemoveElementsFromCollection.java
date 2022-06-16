package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsFromCollection {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println(list);

        System.out.println("_________________________________________________");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list2.removeIf( p -> p < 4);
        System.out.println(list2);




    }
}
