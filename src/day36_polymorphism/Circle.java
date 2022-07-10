package day36_polymorphism;

public class Circle {

    private double radius;

    public static final double PI = 3.14;


    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

   public double area(){
        return radius * radius * PI;
   }

   public double perimeter(){
        return 2 * radius * PI;
   }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }



    // == compare objects

    // .equals() comparing the value of object

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Circle)){ // if the specified object is not circle, then we should not compare them
            System.err.println("Invalid object");
            System.exit(1);
        }

        if(radius == ((Circle) obj).radius){ // if the current circle radius is equal to the given circle radius, then to circles are equal
            return true;
        }
        return false;

    }
}
