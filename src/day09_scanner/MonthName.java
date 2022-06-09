package day09_scanner;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNum = input.nextInt();
        String result = "Invalid";
        if(monthNum >= 1 && monthNum <=12){
            switch(monthNum){
                case 1:
                    result = "January";
                    break;
                case 2:
                    result = "FEbruary";
                    break;
                case 3:
                    result = "March";
                    break;
                case 4:
                    result = "April";
                    break;
                case 5:
                    result = "May";
                    break;
                case 6:
                    result = "June";
                    break;
                case 7:
                    result = "July";
                    break;
                case 8:
                    result = "August";
                    break;
                case 9:
                    result = "September";
                    break;
                case 10:
                    result = "October";
                    break;
                case 11:
                    result = "November";
                    break;
                default:
                    result = "DEcember";
                    break;

            }
        }
        input.close();
        System.out.println(result);
    }
}
