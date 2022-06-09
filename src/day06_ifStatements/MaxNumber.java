package day06_ifStatements;

public class MaxNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        boolean isMax = num2 > num1;
        if(isMax){
            System.out.println(num2 + " is the maximum number");
        }
        else{
            System.out.println("The numbers are equal");
        }
    }
}
