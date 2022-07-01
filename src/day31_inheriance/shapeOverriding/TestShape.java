package day31_inheriance.shapeOverriding;

import java.security.PrivilegedExceptionAction;

public class TestShape {

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);

        square.draw();

        Circle circle = new Circle(3.5);

        System.out.println(circle);


        Triangle triangle = new Triangle(3, 2, 4, 5);
        System.out.println(triangle);
        triangle.draw();


        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println(rectangle);
        rectangle.draw();





    }
}
