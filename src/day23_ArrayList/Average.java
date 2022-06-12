package day23_ArrayList;

import java.util.ArrayList;

public class Average {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);
        int sum = 0;

        for(Integer each: numbers){
            sum += each;
        }
        double average = (double)sum / numbers.size();

        System.out.println(average);




    }
}
