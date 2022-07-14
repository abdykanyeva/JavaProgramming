package day38_exceptions.shape;

import java.text.DecimalFormat;

public abstract class Shape {

    private String name;


    public Shape(String name) {
        setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double area();


    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat("0.0");
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                " area " + df.format(area() )+
                '}';
    }
}
