package day38_exceptions.realEstate;

import java.util.ArrayList;

public class Circle extends Shape{

    private double radius;

    public final static double pi = 3.14;


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
        return pi * radius * radius;

    }



}
