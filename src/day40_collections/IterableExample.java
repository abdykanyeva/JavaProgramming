package day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,1, 2, 3,4 ,5 ,5, 6));

       /* for (Integer each : list) {
            if(each < 5){
                list.remove(each);
            }
        }

        */

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 5){
                list.remove(i);
            }
        }
        System.out.println(list);

        List<Integer> list1 = new Vector<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5,1,2, null));
        System.out.println(list1);




    }
}
