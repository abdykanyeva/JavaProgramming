package day38_exceptions.shape;

public class Circle extends Shape{

    private double radius;


    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new InvalidShapeExceptions("Radius can not be set to zero: "+ radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

}
