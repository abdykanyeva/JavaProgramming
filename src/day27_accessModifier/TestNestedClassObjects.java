package day27_accessModifier;

public class TestNestedClassObjects {


    public static void main(String[] args) {
        Car obj1 = new Car(); // Car engine

        obj1.new CarEngine(); // CarEngine Object


       new Car.StaticInnerClass();
    }
}
