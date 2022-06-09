package day04_concatenation;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {
        //-----------Implicit type casting----------------

        byte a =15;

        short b = a;
        int c = a; //implicit casting
        System.out.println(b);

        long d = 3000L;
        float f = d; // implicit casting

        // smaller primitive types can be easily casted into larger prim.types

        // larger prim.types to the smaller can be done explicitly


        //-----------------------explicit casting-------------------------------

        int x = 100;
        byte y = (byte)x;


        //System.out.println(y);
        float t = 2.0569f;
        short i = (short)t;
       // System.out.println(i);

        double u = 3000.5;
        int p = (int) u;
        System.out.println(p);

        int o = 100;
        double d1 = o;
        System.out.println(d1);








    }

}
