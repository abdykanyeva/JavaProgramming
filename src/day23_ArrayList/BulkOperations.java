package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(numbers);
        list1.addAll(1, numbers);


        System.out.println(list1);


        System.out.println("_________________________________________");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75, 85, 95, 70, 80));
        System.out.println(scores);


        System.out.println("_________________________________________");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir", "Hasan", "Sumeye"));

        System.out.println(students);

        students.addAll(2, Arrays.asList("Shukur", "Sumeye", "TAtiana"));

        System.out.println(students);

        System.out.println("_________________________________________");

        Integer[] nums = {1, 2, 3,4, 5, 6, 7, 8};
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));
        // l1.addAll(Arrays.asList((nums)));

        System.out.println(l1);


        System.out.println("_________________________________________");


        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Muhtar", "Alena", "Gadir","Ali"));

        System.out.println(employeesList);

        boolean hasAlena = employeesList.contains("Alena");
        
        boolean hasAlenaGadir = employeesList.containsAll(Arrays.asList("Alena","Gadir"));
        
        boolean hasAliMuhtarKuzzat = employeesList.containsAll(Arrays.asList("Ali", "Muhtar", "Kuzzat"));
        
        
        System.out.println(hasAlena);

        System.out.println("hasAlenaGadir = " + hasAlenaGadir);

        System.out.println("hasAliMuhtarKuzzat = " + hasAliMuhtarKuzzat);


        System.out.println("___________________________________________");

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        list.removeAll(Arrays.asList(10, 20));

        System.out.println(list);









    }

}
