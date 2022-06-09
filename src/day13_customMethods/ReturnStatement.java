package day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) {

    }


    public static void eligible(int age){
        if(age < 0 || age > 150){
            System.out.println("Invalid age");
            return; // if the age is invalid, then this gets
        }

        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("Not eligible");
        }

    }





}
