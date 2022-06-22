package day27_accessModifier;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);

        System.out.println("circle1.calcPerimeter() = " + circle1.calcPerimeter());
        System.out.println("circle1.calcPerimeter() = " + circle1.calcPerimeter());
        System.out.println("Circle.pi = " + Circle.pi);
        Circle.printPiValue();

    }
}
