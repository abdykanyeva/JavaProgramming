package day07_ifElse;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary = 135000;
        double taxRate = 0;
        boolean isMarried = true;

        if(salary >= 130000){
            taxRate =0.35;
        }
        else if(salary >= 100000 && salary <= 129000){
            taxRate = 0.30;
        }
        else if(salary >= 80000 && salary <= 99000){
            taxRate = 0.25;
        }
        else if(salary <=80000){
            taxRate = 0.20;
        }
        if(isMarried){
            taxRate -= 0.05;
        }
        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);



    }
}

/*
 Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                    if the person is married, he/she will pay 5% less tax
 */