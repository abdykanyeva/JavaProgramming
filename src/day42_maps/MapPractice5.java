package day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice5 {

    public static void main(String[] args) {



        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B02", "Nora");
        map.put("A02", "Kosh");
        map.put("D02", "Dosh");

        map.forEach( (k, v) -> {System.out.println(k +": " + v); });





    }
}
