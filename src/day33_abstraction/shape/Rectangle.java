package day33_abstraction.shape;

public class Rectangle extends Shape{

    private double length;
    private double width;


    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public void draw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}
