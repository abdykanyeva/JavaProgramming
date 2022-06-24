package day28_encapsulation.encapsulationIntro;

public class Circle {

    private double radius;
    public static double pi;

    public Circle(double radius){
        setRadius(radius);
    }

    static{
        pi = 3.14;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius <= 0){
            System.out.println("Radius can't be Zero or Negative: " + radius );
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea(){
        double area = pi * radius * radius;
        return area;
    }
    public double calcPerimeter(){
        return 2 * pi * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}

/* Create a class named Circle

        privtae variables:
            radius

        public variable:
            pi

         Encapsulate all the private fields

                 1. radius of the circle can not be zero or negative

         Add a constructor that can set the raidus of coircle when circle object is created
                 (If the arguments not valid it should not be set to the instances)

         Methods:
             calcArea()
             calcPerimeter()
             toString(): displays the radius, area and perieter
             of the circle when the circle object is passed in the print statement

*/
