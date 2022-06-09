package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 100;
        boolean isEven = num % 2 == 0;

        if(isEven){
            System.out.println("Even number");
        }
        if(!isEven){
            System.out.println("Odd number");
        }

        System.out.println("--------------------------------------------");
        if(num % 2 == 0){
            System.out.println("Even number");
        }
        if(num % 2 != 0){
            System.out.println("Odd number");
        }
    }
}
