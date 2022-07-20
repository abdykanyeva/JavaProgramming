package day42_maps;

import java.util.*;

public class MapMethods1 {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B02", "Nora");
        map.put("A02", "Kosh");
        map.put("D02", "Dosh");

        map.get("B02");
        map.put("C02", "Lucy");
        map.put("B02", "Sanzhar");

        System.out.println(map);

        System.out.println("_______________________________________");


        String str = "bbcccaaaaa";

        Map<String, Integer> freqChar = new LinkedHashMap<>();

        for(String each : str.split("")){
            int freq = Collections.frequency(Arrays.asList(str.split("")), each);
            freqChar.put(each, freq);
        }

        System.out.println(freqChar);

        System.out.println("_______________________________________");


        String str1 = "aabcccdeeeef";

        Map<String, Integer> uniqueChar = new LinkedHashMap<>();

        for(String each : str1.split("")){
            int frequency = Collections.frequency(Arrays.asList(str1.split("")), each);
            if(frequency == 1){
                uniqueChar.put(each, frequency);
            }
        }
        System.out.println(uniqueChar);

        System.out.println("_______________________________________");









    }
}
/*

    pair: id - name


 */