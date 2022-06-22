package utilities;

import day27_accessModifier.AccessModifiers;
import day27_accessModifier.Date;


public class Test {
    public static void main(String[] args) {

        System.out.println(Date.d);
        System.out.println(Date.e);
        System.out.println(Date.f);

        Date.method3();
        Date.method4();

        Date obj1 = new Date();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.c);
        obj1.method1();
        obj1.method2();


        System.out.println("______________________________________________");

        System.out.println(AccessModifiers.publicDate);

      //  System.out.println(AccessModifiers.protectedData); only accessible when subclass will be created

        // System.out.println(AccessModifiers.defaultDate); default: no chance to call from different package

        new AccessModifiers();

    }
}
