package day12_customMethod;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String items = input.next();

        int price = 0;
        if(price <= 100 ){
            switch(items) {

                case "Blanket":
                    price = price + 60;
                    break;

                case "Charger":
                    price = price + 5;
                    break;

                case "Hat":
                    price = price + 25;
                    break;

                case "Headphones":
                    price = price + 30;
                    break;

                case "Laptop":
                    price = price + 200;

                case "Pants":
                    price = price + 50;
                    break;

                case "Pillow":
                    price = price + 40;
                    break;

                case "Smartphone":
                    price = price + 1000;
                    break;

                case "Socks":
                    price = price + 5;
                    break;

                case "USB cable":
                    price = price + 10;
                    break;

                default:
                    System.out.println("Sorry, that is an invalid item");
        }
        }else{
            System.out.println("Sorry, not enough funds on your gift card ");
        }
        System.out.println("Thank you for your purchase!");
        System.out.println("Your current balance is: " + price);

    }
}
