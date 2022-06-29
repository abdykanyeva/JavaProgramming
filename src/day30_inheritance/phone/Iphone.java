package day30_inheritance.phone;

public class Iphone extends Phone{    // Iphone is a Phone

    public Iphone( String model, String size, double price, String color){
        super("Apple", model, size, price, color);
    }

    public static boolean hasApplePay = true;

    public void faceTime(long phoneNumber){
        System.out.println(getModel() +" is face timing with " + phoneNumber);

    }

    public void faceTime(String email){
        System.out.println(getModel() +" is face timing with " + email);
    }


}
