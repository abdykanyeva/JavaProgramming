package day16_nestedLOop;

import java.util.Scanner;

public class MyCydeoLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = input.next();

        System.out.println("Enter your password");
        String password = input.next();

        if(username.equals("Cydeo") && username.equals("Cydeo123")){
            System.out.println("Successfully logged in");
        }else{
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter your username");
                username = input.next();

                System.out.println("Enter your password:");
                password = input.next();


                if(username.equals("Cydeo") && username.equals("Cydeo123")){
                    System.out.println("Now you are logged in");
                    break;
                }


            }


        }

    }
}


/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."


 */