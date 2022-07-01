package day31_inheriance.shapeOverriding;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return radius * 2 * 3.14;
    }

    @Override
    public void draw() {
        super.draw();
        // code fragments that can draw circle

    }
}
