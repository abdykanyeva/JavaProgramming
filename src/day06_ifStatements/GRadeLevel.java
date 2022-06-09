package day06_ifStatements;

import java.util.Scanner;

public class GRadeLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your grade level: ");
        int gradeLevel = input.nextInt();
        if(gradeLevel <= 5){
            System.out.println("Elementary School");
        }
        else if(gradeLevel <= 8){
            System.out.println("Middle school");
        }
        else if(gradeLevel <= 12){
            System.out.println("High school");
        }
        else if(gradeLevel <= 16){
            System.out.println("College");
        }
        else if(gradeLevel <= 18){
            System.out.println("Grad school");
        }

    }
}
