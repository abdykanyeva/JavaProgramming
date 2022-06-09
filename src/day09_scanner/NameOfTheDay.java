package day09_scanner;

import java.util.Scanner;

public class NameOfTheDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the day in number: ");
        // int dayOfTheWeek = new Scanner(System.in).nextInt();
        int dayOfTheWeek = input.nextInt();
        String result;

        switch(dayOfTheWeek){
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "THursday";
                break;
            case 5:
                result = "FRiday";
            case 6:
                result = "Saturday";
            case 7:
                result = "Sunday";
            default:
                result = "Invalid";

        }
        System.out.println(result);
    }
}
