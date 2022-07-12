package day37_exceptions;

import day16_nestedLOop.IndexOfJava;
import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        Car car = null;


        try{
            car.drive();
        }catch(ArithmeticException e){
            System.out.println("First catch  block");
            e.printStackTrace();
        }catch(ClassCastException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("tHIRD cATCH bLOCK");
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("This is a 5th catch block");
            e.printStackTrace();
        }

        System.out.println("Program 1 ended");

    }
}
