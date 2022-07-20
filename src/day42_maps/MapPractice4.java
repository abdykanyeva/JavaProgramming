package day42_maps;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice4 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Java Developer");
        person1.put("salary", 90000);
        person1.put("hired_date", LocalDate.of(2022, 1, 15));
        person1.put("married", true);

        //  System.out.println(person1);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Java Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2022, 1, 15));
        person2.put("married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Java Developer");
        person3.put("salary", 100000);
        person3.put("hired_date", LocalDate.of(2022, 1, 15));
        person3.put("married", false);


        Map<String, Object> person4 = new LinkedHashMap<>();
        person3.put("name", "Arthur");
        person3.put("gender", 'M');
        person3.put("age", 29);
        person3.put("job_title", "Java Developer");
        person3.put("salary", 90000);
        person3.put("hired_date", LocalDate.of(2021, 1, 15));
        person3.put("married", true);


        Map<Integer, Map<String, Object>> mapOfMaps = new LinkedHashMap<>();

        mapOfMaps.put(0, person1);
        mapOfMaps.put(1, person2);
        mapOfMaps.put(2, person3);
        mapOfMaps.put(3, person4);

        System.out.println(mapOfMaps);
        mapOfMaps.get(1).replace("salary", 120000);

        System.out.println(mapOfMaps.get(1));


        System.out.println("_______-----_______________________________");

        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    eachEntry.setValue(((Integer)eachEntry.getValue() )+ 10000);
                }
            }
        }
        System.out.println(mapOfMaps);

        System.out.println("__________________________________________");

        Map<Map<String, Integer>, Map<String, Integer>> mapOfMaps2 = new LinkedHashMap<>();



    }
}
