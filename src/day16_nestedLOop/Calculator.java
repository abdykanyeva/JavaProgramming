package day16_nestedLOop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.println("Enter your first number: " );
            double firstNum = input.nextDouble();

            System.out.println("Enter math operator: ");
            String mathOper = input.next();

            while(!(mathOper.equals("+") || mathOper.equals("-") || mathOper.equals("*") || mathOper.equals("/"))){
                System.out.println("Invalid entry. Please re-enter");
                mathOper = input.next();
            }

            System.out.println("Enter your second number: ");
            double secondNum = input.nextDouble();

            double result = 0;

            switch(mathOper){
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    result = firstNum / secondNum;
                    break;

            }
            System.out.println(result);
            System.out.println("Would yu like to continue? yes/no");
            String answer = input.next().toLowerCase();

            while(!(answer.equals("yes")|| answer.equals("no")) ){
                System.out.println("Invalid entry. Would you like to continue? yes/no");
                answer = input.next().toLowerCase();
            }

            if(answer.equals("no")){
                break;
            }


        }

    }
}
