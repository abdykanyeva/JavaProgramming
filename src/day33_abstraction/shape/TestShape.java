package day33_abstraction.shape;

public class TestShape {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(6, 4);
        Square square = new Square(5);
        Circle circle = new Circle(4);

        System.out.println(rectangle);
        rectangle.draw();
        System.out.println(square);

        square.draw();

        System.out.println(circle);
        circle.draw();

    }
}
