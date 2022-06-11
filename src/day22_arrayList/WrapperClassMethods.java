package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1); //201

        Integer num = Integer.parseInt(str); // unboxing

        int num1 = Integer.parseInt(str);

        System.out.println(num1  + 1);

        Integer num2 = Integer.valueOf(str);

        System.out.println("_________________________________");


        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);
        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("__________________________________");

        String num4 = "1.25";


        Double num5 = Double.parseDouble(num4);
        System.out.println(num5);

        System.out.println("____________________________________");

        Double num7 = 1.25;
        double  num8 = num7;






    }
}
