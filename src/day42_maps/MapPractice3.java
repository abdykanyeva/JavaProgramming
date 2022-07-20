package day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

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


        Map<String, Object> [] arrayOfMap = new Map[4];


        arrayOfMap[0] = person1;
        arrayOfMap[1] = person2;
        arrayOfMap[2] = person3;
        arrayOfMap[3] = person4;

        arrayOfMap[1].replace("salary", ((Double)arrayOfMap[1].get("salary") )+ 10_000);
        arrayOfMap[0].replace("name", "Iskhak");

        System.out.println(Arrays.toString(arrayOfMap));

        System.out.println("_______________________________________");



        int count = 0;

        for(Map<String, Object> eachMap: arrayOfMap){
            for(Map.Entry<String, Object> eachEntry : eachMap.entrySet()){
                if(eachEntry.getKey().equals("salary")){
                    if((Double)eachEntry.getValue() < 100_000){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);


    }
}
