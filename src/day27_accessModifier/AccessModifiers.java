package day27_accessModifier;

public class AccessModifiers {

    public static int publicDate = 200;


    protected static int protectedDta = 300;

    static int defaultDate = 400;

    private static int privateData = 500;

     public AccessModifiers(){

    }

    public static void  publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Protected");
    }

    static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private");
    }





    public static void main(String[] args) {
        System.out.println(publicDate);  // accessible within same class , object, package and outside of the package

        System.out.println(protectedDta); // accessible within same class and object, outside  the package only accessible within the subclass

        System.out.println(defaultDate); // accessible within same class and same package

        System.out.println(privateData); // private is accessible within the same class ONLY

        new AccessModifiers();
    }
}
