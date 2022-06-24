package day28_encapsulation.encapsulationIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        ArrayList<Candy> candies = new ArrayList<>();
        Candy candy1 = new Candy("Yashar", 5, 5.5, true);
        Candy candy2 = new Candy("Rahat", 2, 7.5, false);
        Candy candy3 = new Candy("KitKat", 2, 0, true);
        Candy candy4 = new Candy("JustChocolate", 5, 5.5, false);
        Candy candy5 = new Candy("Rosher", 3, 5.5, true);

        Candy [] arrayCandy = {candy1, candy2, candy3, candy4, candy5};
        candies.addAll(Arrays.asList(arrayCandy));

        for(Candy each: candies){
            System.out.println(each.getBrand() + ":"  + each.getPrice());
        }
    }


}
  /*
  Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each
                candy

   */