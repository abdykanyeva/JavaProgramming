package day29_inheritance.phone;

public class PhoneTest {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.setInfo("Iphone", "Iphone13", "M", "White", 1200);

        iphone.faceTime("avileva@gmail.com");
        System.out.println(iphone);

        Nokia nokia = new Nokia();
        nokia.selfDefense();

    }
}
