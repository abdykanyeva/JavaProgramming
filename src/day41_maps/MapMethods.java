package day41_maps;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("C03", "Nora");
        map.put("A03", "Abidullah");
        map.put("A07", "Abidullah");

        System.out.println(map);

        System.out.println(map.get("C03"));

        map.put("C03", "Tatyana");
        map.put("A07", "Madiyar");
        System.out.println(map);


        System.out.println(map.get("A07"));
        map.replace("A07", "Aseel");
        System.out.println(map);

        map.remove("A03");
        System.out.println(map);
        System.out.println(map.containsKey("C02"));

        System.out.println(map.containsKey("H98"));

        System.out.println(map.containsValue("Josh"));

        System.out.println(map.isEmpty());

        System.out.println(map.equals(map));









    }
}



/*

pair: id - name

        put(key, value) - inserts the given key and value to the maps as a pair
        can also be used for updating the values


        size(): returns the total number of pairs

        get(): RETURNS THE VALUE OF THE SPECIFIED KEY

        replace(): also can be done by put() method, but this method is faster because put method tries to insert a pair

        replace(key, newValue): replaces the value of the specified jey with new value

        remove(key); removes a pair with the matching key from the map

        containsKey(key): returns true if the specified key is contained in the map

        containsValue(value): returns true if the specified value is included in the map

        equals() : compares the object to another

        clear(): everything will be cleared from the map

        putAll():











 */