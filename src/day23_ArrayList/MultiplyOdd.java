package day23_ArrayList;

import java.util.ArrayList;

public class MultiplyOdd {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);



        for(Integer each: numbers){

            if(each % 2 !=0){
                each *= 2;
                numbers.add(each);
            }
        }




    }
}
