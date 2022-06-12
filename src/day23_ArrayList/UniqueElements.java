package day23_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeyee");
        names.add("Ali");
        names.add("Sumeyee");


        for(String each: names){
            if(names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
                break;
            }
        }

    }
}
