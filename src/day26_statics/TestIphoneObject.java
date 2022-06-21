package day26_statics;

public class TestIphoneObject {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone("Iphone12", "black", 1000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        System.out.println(iPhone.brand);
        System.out.println(iPhone.OS);


        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        iPhone.printPhoneInfo();
    }


}
