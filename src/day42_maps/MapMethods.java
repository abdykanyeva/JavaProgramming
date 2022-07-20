package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("C03", "Nora");
        map.put("A03", "Abidullah");
        map.put("A07", "Abidullah");


        Map<String, String> employees = new LinkedHashMap<>();
        employees.putAll(map);

        System.out.println(employees);

        System.out.println(map.equals(employees));





    }
}
