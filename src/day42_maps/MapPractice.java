package day42_maps;



import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {


        Map<String, Object> employee = new LinkedHashMap<>();
        employee.put("name", "Arthur");
        employee.put("gender", 'M');
        employee.put("age", 32);
        employee.put("job_title", "Developer");
        employee.put("salary", 100000.5);
        employee.put("married", true);

        System.out.println(employee);
        System.out.println(employee.get("name"));
        System.out.println(employee.get("gender"));
        System.out.println(employee.get("salary"));




    }
}
