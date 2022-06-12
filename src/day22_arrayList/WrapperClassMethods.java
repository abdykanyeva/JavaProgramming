package day22_arrayList;

import java.util.Arrays;

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

        System.out.println("_________________________________________________________");

        char ch = 'A';

        boolean q1 = Character.isDigit(ch);

        boolean q2 = Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCase = Character.isUpperCase(ch);

        boolean k1 = !Character.isLetterOrDigit(ch); // special character @!$#

        System.out.println("q2 = " + q2);

        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCase = " + isUpperCase);

        System.out.println("k1 = " + k1);


        System.out.println(q1);

        System.out.println("_______________________________________________");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for(char each : string.toCharArray()){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);









    }
}
