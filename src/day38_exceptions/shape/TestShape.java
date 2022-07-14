package day38_exceptions.shape;

import java.util.ArrayList;
import java.util.Arrays;

public class TestShape {

    public static void main(String[] args) {


        ArrayList<Shape> shapeList = new ArrayList<>();

        Circle circle = new Circle("Circle", 5);
        Square square = new Square("Square", 3);


        shapeList.addAll(Arrays.asList(circle, square));
        System.out.println(shapeList);



    }
}
