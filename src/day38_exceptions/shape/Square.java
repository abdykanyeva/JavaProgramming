package day38_exceptions.shape;

public class Square extends Shape {

    private double side;


    public Square(String name, double side) {
        super(name);
        setSide(side);
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            throw new InvalidShapeExceptions("Square can not be zero");
        }

        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
