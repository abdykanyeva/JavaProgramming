package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMaps {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Aaron", 75000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        // iterating the map by the keys

        for(String eachKey : map.keySet()){

            System.out.println(eachKey);
            //map.replace(eachKey, map.get(eachKey) * 2);
        }

        System.out.println(map);

        System.out.println("_______________________________________");


        // Iterating the map by the values

        for(Integer eachValues : map.values()){

            System.out.println(eachValues);

        }

        System.out.println("_______________________________________");

        for( Map.Entry<String, Integer> eachEntry :map.entrySet()){
            System.out.println(eachEntry.getKey() +": " + eachEntry.getValue());
            eachEntry.setValue(eachEntry.getValue() + 10000);

        }

        System.out.println(map);






    }
}
