package day31_inheriance.shapeOverriding;

public class Triangle extends Shape{

    private double height;
    private double base;
    private double a;
    private double b;

    public Triangle(double height, double base, double a, double b){
        setHeight(height);
        setBase(base);
        setA(a);
        setB(b);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    @Override
    public double area(){
        return (height * base)/2;
    }

    @Override
    public double perimeter(){
        return a + b + base;
    }

    public  void draw(){
        super.draw();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();

        }
    }



}
