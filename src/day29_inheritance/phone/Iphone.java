package day29_inheritance.phone;

public class Iphone extends Phone {


    public void faceTime(long phoneNum){
        System.out.println("Receive Face Time calls though "+phoneNum);
    }

    public void faceTime(String email){
        System.out.println("Receive Face Time calls through emails: " + email);
    }
}
