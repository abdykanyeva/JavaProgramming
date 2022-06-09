package day18_garbageCollection;

public class TestBankAccount {

    public static void main(String[] args) {



        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Gadir", 123456789);

        System.out.println(obj1);

        obj1.deposit(1000);
        obj1.checkBalance();

        obj1.withdraw(700);
        obj1.checkBalance();

        System.out.println("_________________");

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.setInfo("Sebastian", 1233450);
        account2.setInfo("Umran", 9876543);

        account1.deposit(5000);
        System.out.println(account1);
        System.out.println(account2);

    }
}
