package day38_exceptions.realEstate;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        ArrayList<Shape> shapes = new ArrayList<>(Arrays.asList(
                new Circle(15),
                new Circle(20),
                new Circle(10),
                new Rectangle(30, 20),
                new Rectangle(20, 25),
                new Square(20),
                new Square(25),
                new Square(30)

        ));

        System.out.println(shapes);

        ArrayList <Shape> propertyList = new ArrayList<>();

        for(Shape eachShape: shapes){
            if(eachShape.area() >= 600){
                propertyList.add(eachShape);
            }
        }
        System.out.println(propertyList);
















    }
}
