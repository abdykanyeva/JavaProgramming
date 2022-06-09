package day07_ifElse;

public class LoanApplication {
    public static void main(String[] args) {

        int salary = 60000;
        int creditScore = 500;
        String result = "";
        if (salary >= 45000 && creditScore >= 700) {
            System.out.println("You are eligible for the loan");
        } else {
            System.out.println("You are not eligible");
        }
    }
}