package day42_maps;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Aaron", 75000);

        // iterating the map by the keys

        for (String eachKey : map.keySet()) {
            //map.replace(eachKey, map.get(eachKey) * 2);
            System.out.println(eachKey);
        }
        System.out.println(map);


        System.out.println("_______________________________________");


        // iterating map by the values

        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("_______________________________________");

        // Iterate the map by entries

        for(Map.Entry <String, Integer> eachEntry: map.entrySet()){
            System.out.println(eachEntry);
        }

        System.out.println("_______________________________________");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000);

            System.out.println(eachKey +": " + eachValue);
        }

        System.out.println(map);



    }
}
