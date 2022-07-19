package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();  // random order, accept null key

        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Aaron", 75000);
        map.put("Chris", null);
        map.put("Breanna", null);
        map.put(null, 120000);
        map.put(null, 110000);
        System.out.println(map);

        System.out.println("__________________________________");

        Map<String, Integer> map1 = new LinkedHashMap<>(); // maintains insertion order, accept null key


        map1.put("Daniel", 95000);
        map1.put("Emily", 100000);
        map1.put("Bella", 85000);
        map1.put("Aaron", 75000);
        map1.put("Chris", null);
        map1.put("Breanna", null);
        map1.put(null, 120000);
        map1.put(null, 110000);
        System.out.println(map1);

        System.out.println("__________________________________");

        Map<String, Integer> map2 = new Hashtable<>(); // random order, does not accept null as a key, Synchronized
        map2.put("Daniel", 95000);
        map2.put("Emily", 100000);
        map2.put("Bella", 85000);
        map2.put("Aaron", 75000);
      //  map2.put("Chris", null);  VALUE AND KEY IN THE HASHTABLE CAN NOT BE NULL
        //map2.put("Breanna", null);
       // map2.put(null, 120000);

        try{
            map2.put("Diana", 110000);
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println(map2);




        System.out.println("__________________________________");

        Map<String, Integer> map3= new TreeMap<>(); // in the sorted order, does not accept null key
        map3.put("Daniel", 95000);
        map3.put("Emily", 100000);
        map3.put("Bella", 85000);
        map3.put("Aaron", 75000);
        map3.put("Chris", null);
        map3.put("Breanna", null);
        //map3.put(null, 120000);
        //map3.put(null, 110000);
        System.out.println(map3);




    }
}
/*
Daniel = 95000
Emily = 100000
Bella  = 85000

 */