package day26_statics;

public class Iphone {

    public static String brand = "Apple"; // static: Apple is the brand for all the Iphone objects
    public String model ; // instance: the model for Iphone object is different
    public String color;
    public double price;
    public  static String OS = "IOS"; // static: operating system is same for all the iphone objects
    public  static  String madeIn = "China";

    public static boolean hasBattery = true;
    public static boolean hasTouchScreen = true;
    public static boolean isExpensiveToFix = true;


    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){    // instance methods accept both static and nonstatic
        System.out.println("Model:" + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }


    public static void printOS(){
        System.out.println("Operating system: " + OS);
    }








}

/*


brand, model, color, price, operat system
 */
