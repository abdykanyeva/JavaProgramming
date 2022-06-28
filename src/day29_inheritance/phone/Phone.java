package day29_inheritance.phone;

public class Phone {

    private String brand, model, size, color;
    private double price;


    public void setInfo(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null || brand.trim().isEmpty()){
            System.out.println("Invalid input: "+brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null || model.trim().isEmpty()){
            System.out.println("Invalid: " + model);
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.trim().isEmpty()){
            System.out.println("Invalid: " + model);
            System.exit(1);
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.out.println("Price can not be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    public void call(long phoneNum){
        System.out.println(phoneNum + " is calling");
    }

    public void text(long phoneNum){
        System.out.println(phoneNum + " is texting");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
