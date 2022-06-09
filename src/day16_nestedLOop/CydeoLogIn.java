package day16_nestedLOop;

import java.util.Scanner;

public class CydeoLogIn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = input.next();

        System.out.println("Enter your password");
        String password = input.next();

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Successfully logged in");
        } else {
            for (int i = 0; i < 3; i++) {

                if(i != 2) {
                    System.err.println("Incorrect password or username. Please re-enter");
                }else{
                    System.err.println("This is your last chance, Please re-enter your username and password");
                }
                System.out.println("Enter your username: ");
                username = input.next();

                System.out.println("Enter your password:");
                password = input.next();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) { // if user enters valid credentials
                    System.out.println("You are now logged in");
                    break;
                }

            }

            if (!(username.equals("Cydeo") && password.equals("Wooden Spoon"))) {
                System.err.println("YOu are locked");
            }


        }input.close();
    }

    public static void cydeoLogin(String username, String password){
        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{

        }
    }

}
