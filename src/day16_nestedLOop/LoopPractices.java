package day16_nestedLOop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {


        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
        }

        System.out.println("_________________________________________________________________________");

        int j = 0;
        while(j < 5){
            System.out.println("Hello" + j);
            j++;
        }

        System.out.println("_____________________________________________________");

        int k = 0;
        do{
            System.out.println("Hello " + k);
            k++;
        }while(k < 5);

        System.out.println("______________________________________________");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();


        while(score > 100 || score < 0){
            System.out.println("PLease enter your score: ");
            score = input.nextInt();


        }



        if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }









    }
}
