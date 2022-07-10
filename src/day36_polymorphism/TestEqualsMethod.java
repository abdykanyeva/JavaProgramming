package day36_polymorphism;

public class TestEqualsMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false ==> comparing memory allocations

        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));


        Iphone iphone = new Iphone("Apple", "Iphone 12", "Medium", 900, "Black");
        Iphone iphone1 = new Iphone("Apple", "Iphone 12", "Medium", 900, "White");

        System.out.println(iphone.equals(iphone1));
    }
}
