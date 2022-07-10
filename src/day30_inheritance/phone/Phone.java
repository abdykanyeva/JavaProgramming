package day30_inheritance.phone;

import java.util.Arrays;

public class Phone {

    private String brand, model, size;
    private double price;
    private String color;


    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price <= 0){
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        String [] colors = {"Black", "White", "Silver", "Gold", "PInk"};
        if(Arrays.asList(colors).contains(color)){
            this.color = color;
        }else{
            System.err.println("Invalid color " + color+"\ncolor of the phone can only be: " + Arrays.asList(colors));
            System.exit(1);
        }

    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void call(long phoneNum){
        System.out.println(getModel() + " is calling "+phoneNum);
    }

    public void text(long phoneNum){
        System.out.println(getModel() + " is texting "+phoneNum);
    }
}
