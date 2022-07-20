package day42_maps;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Java Developer");
        person1.put("salary", 90000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);

      //  System.out.println(person1);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 31);
        person2.put("job_title", "Java Developer");
        person2.put("salary", 90000.5);
        person2.put("hired_date", LocalDate.of(2022, 1, 15));
        person2.put("married", true);

        System.out.println(person2.get("name"));

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Iskender");
        person3.put("gender", 'M');
        person3.put("age", 31);
        person3.put("job_title", "Java Developer");
        person3.put("salary", 100000.5);
        person3.put("hired_date", LocalDate.of(2022, 1, 15));
        person3.put("married", false);


        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Arthur");
        person4.put("gender", 'M');
        person4.put("age", 29);
        person4.put("job_title", "Java Developer");
        person4.put("salary", 90000.5);
        person4.put("hired_date", LocalDate.of(2021, 1, 15));
        person4.put("married", true);

        System.out.println("_______________________________________");

        List<Map<String, Object>> listOfMaps = new ArrayList<>();
        listOfMaps.add(person1);
        listOfMaps.add(person2);
        listOfMaps.addAll(Arrays.asList(person3, person4));

        System.out.println(listOfMaps);

        System.out.println("_______________________________________");


        for(Map<String, Object> eachEntry: listOfMaps){
            System.out.println(eachEntry);
            for(Map.Entry<String, Object> each: eachEntry.entrySet()){
                System.out.println(each.getKey() +": " + each.getValue());
            }
        }

        System.out.println("_______________________________________");

        // display the names of the employee who are hired this year

        for(Map<String, Object> each: listOfMaps){
            for(Map.Entry<String, Object> each1 : each.entrySet()){
                if(each1.getKey().equals("hired_date")){
                    if(((LocalDate)each1.getValue()).getYear() == 2022){
                        System.out.println(each.get("name"));
                    }
                }

            }
        }

        System.out.println("_______________________________________");


        System.out.println(listOfMaps);

        listOfMaps.get(0).replace("name", "Vasyl");
        System.out.println(listOfMaps);
        System.out.println("_______________________________________");

        listOfMaps.get(listOfMaps.size() - 1).replace("salary",((Double) listOfMaps.get(listOfMaps.size() -1).get("salary") )+50000);

        System.out.println(listOfMaps);


        System.out.println("_______________________________________");

        listOfMaps.get(1).replace("age", ((Integer)listOfMaps.get(1).get("age") )+ 4);
        System.out.println(listOfMaps);

        System.out.println("_______________________________________");

        Map<String, Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color", "Red");
        car1.put("price", 45000.5);

        Map<String, Object> car2 = new LinkedHashMap<>();

        Map<String, Object> car3 = new LinkedHashMap<>();

        Map<String, Object> car4 = new LinkedHashMap<>();


        List<Map<String, Object>> cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1, car2, car3, car4));










    }
}

/*
    keySet(): returns all the keys of the map, return type is Set

    values(): returns all the values of the map, return type is Collection

    entrySet(): returns all the entries( Entry: key & value ) of the map
             These methods are used only within entrySet
                getKey();
                getValue():
                setValue(newValue):




 */
