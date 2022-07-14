package day38_exceptions.realEstate;

import java.text.DecimalFormat;


public abstract class Shape {

    private String name;


    public Shape() {
        setName(getClass().getSimpleName());

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract double area();


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");

        return name + "{" +
                "area='"  + df.format(area()) +
                '}';
    }







}
