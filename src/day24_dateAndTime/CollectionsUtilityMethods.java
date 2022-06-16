package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift"));

        System.out.println(names);

        /*
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("JAva")){
                names.set(i, "Python");
            }

        }

 */


        Collections.replaceAll(names, "Java", "Python");

        System.out.println(names);

        System.out.println("________________________________________________________________");


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 50, 50, 50, 70));


        int frequency = Collections.frequency(list, 50);
        System.out.println(frequency);

        System.out.println("________________________________________________________________");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 20,  30, 30, 40, 40, 50, 50, 50, 50, 70));

        for(Integer each : numbers){
            if(Collections.frequency(numbers, each) == 1){
                System.out.println(each);
            }
        }







    }
}
