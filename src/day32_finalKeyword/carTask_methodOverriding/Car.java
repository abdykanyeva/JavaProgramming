package day32_finalKeyword.carTask_methodOverriding;

public class Car {

    private String make, model, color;
    private int year;
    private double price;

    public static int numberOfWheel;
    public static boolean hasBattery;

    public Car( String model, String color, int year, double price) {
        setMake(getClass().getSimpleName()); // setting the class name to the make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);



    }

    static {
        numberOfWheel = 4;
        hasBattery = true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if(year <= 0){
            System.out.println("Invalid year: "+year);
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(price <= 0){
            System.out.println("Invalid price: "+price);
            System.exit(1);
        }
        this.price = price;
    }



    public void start(){
        System.out.println("Press the brake and twist the key to ignition "+make+" "+model);
    }



    public String toString() {
        return make+"{" +
                " model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", number of Wheels=" + numberOfWheel +
                ", has Battery=" + hasBattery +
                '}';
    }
}
