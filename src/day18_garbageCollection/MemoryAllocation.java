package day18_garbageCollection;

class Car{
    public String color;
    public String brand;
    public String model;
}




public class MemoryAllocation {

    public static void main(String[] args) {
        int a = 100;    // stack

    }


    public static void method1(){
        int b = 200; // stack

    }


    public static void method2(){
        String c = "hello world";
//         stack     heap(String pool

        String d = new String("Hello world");


    }
}
