package day42_maps;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {


    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("_______________________________________");

        // how many females and males

        int countFemales = 0;
        int countMales = 0;

        for(String each : employeeMap.values()){
            if(each.equals("M")){
                countMales++;
            }else{
                countFemales++;
            }
        }
        System.out.println("Female: " +countFemales);
        System.out.println("Male: " + countMales);


        // display the names of all the female employees

        for(String each : employeeMap.keySet()){
           String gender = employeeMap.get(each);
           if(gender.equals("F")){
               System.out.println(each);
           }
        }

        System.out.println("_______________________________________");


        // By iterating with Entry

        for(Map.Entry<String, String> eachEntry : employeeMap.entrySet()){
            if(eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }

        System.out.println("_______________________________________");

        // update all the values with male and female

        for(Map.Entry<String, String> eachEntry:employeeMap.entrySet()){
            if(eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else{
                eachEntry.setValue("Female");
            }
        }
        System.out.println(employeeMap);















    }
}