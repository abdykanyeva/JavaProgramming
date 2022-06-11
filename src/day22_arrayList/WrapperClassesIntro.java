package day22_arrayList;

import java.lang.Byte;

public class WrapperClassesIntro {

    public static void main(String[] args) {


        String str = "java";

        int a1 = 10;
        Integer a2 = 10;

        System.out.println("_______________________________________");

        int b1 = 100;
        Integer b2 = b1; // aut boxing

        double c1 = b1;
        long c2 = b1;

       // Long b3 = b1; it will give an error you should choose the right class

        char ch = 'A';
        Character ch1 = ch; // Autoboxing

        double d1 = 5.5;
        Double d2 = d1;

        System.out.println("___________________________________________________");


        Integer n1 = 20;
        int n2 = n1;      // unboxing

        long n3 = n1;
        double n4 = n1;


        Character c11 = 'Z';
        char c22 = c11;  // unboxing









    }

}
