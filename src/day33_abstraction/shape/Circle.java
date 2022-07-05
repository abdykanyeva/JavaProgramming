package day33_abstraction.shape;

public class Circle extends Shape{

    private double radius;

    private final static double PI;

    public Circle(double radius) {
        setRadius(radius);
    }

    static {
        PI = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI *radius;
    }

    @Override
    public void draw() {
        for(int i = -3; i <= 3; i++){
            for (int j = -3; j <= 3 ; j++) {
                if(i * i + j * j <= 9){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }


}
