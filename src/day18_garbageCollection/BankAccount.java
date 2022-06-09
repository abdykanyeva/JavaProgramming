package day18_garbageCollection;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;


    public void setInfo(String accountHolder, long accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }

    public void deposit(double amount){
        if(amount < 1){
            System.out.println("Insufficient amount: " + amount);
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient withdraw amount");
            return;
        }

        balance -= amount;
    }


}
