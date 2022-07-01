package day30_inheritance.phone;

public class TestPhoneObjects {

    public static void main(String[] args) {
        Iphone iphone = new Iphone("IpHONE 12", "Large", 1000.5, "WHite");

        Samsung samsung = new Samsung("Galaxy S22", "Medium", 1100, "Black");

        Nokia nokia = new Nokia("Brick", "Small", 800, "PInk");


        nokia.call(911);
        samsung.call(911);


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);



    }




}
