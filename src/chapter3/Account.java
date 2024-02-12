package chapter3;

public class Account {
    private String name;
    private double balance;
    private String accountNumber;

    public void setName(String name){
        this.name = name;
    }
    public void deposit(double amount){
        if(amount > 0.0){
            balance = balance += amount;
        }

    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void withdrawal(double amount){
        if(balance > 0.0){
            balance = balance -= amount;
        }
    }
    public String getName(){
        return name;
    }
    public double checkBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

}
