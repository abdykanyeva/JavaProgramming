package day42_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {


        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 10000);
        hashMap.put("Bella", 85000);
        hashMap.put("Aaron", 85000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 170000);
        hashMap.put(null, 110000);

        System.out.println(hashMap);
        System.out.println(hashMap.size());

        System.out.println("_______________________________________");


        Map<String, Integer> linkedHashMap= new LinkedHashMap<>();

        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 10000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Aaron", 85000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 170000);
        linkedHashMap.put(null, 110000);

        System.out.println(linkedHashMap);

        System.out.println("_______________________________________");

        SortedMap<String, Integer> treeMap = new TreeMap<>();


        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 10000);
        treeMap.put("Bella", 85000);
        treeMap.put("Aaron", 85000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null);
       // treeMap.put(null, 170000);
       // treeMap.put(null, 110000);

        System.out.println("Tree map" + treeMap);

        Map<String, Integer> hashTable = new Hashtable<>();

        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 10000);
        hashTable.put("Bella", 85000);
        hashTable.put("Aaron", 85000);
//        hashTable.put("Chris", null);    VALUE AND KEY CAN NOT BE NULL
//        hashTable.put("Breanna", null);
//        hashTable.put(null, 170000);

//        try{
//            hashTable.put(null, 110000);
//        }catch(NullPointerException e){
//            e.printStackTrace();
//        }
//

        System.out.println(hashTable);


        





/*


Daniel = 95000
Emily = 1000
bella = 85000
 */


    }
}
