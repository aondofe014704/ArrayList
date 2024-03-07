package BankApplication;

import DiaryPackage.InvalidUserNameException.InvalidUserNameException;

public class Account {
    private String accountName;
    private String accountPin;
    private int accountBalance;
    private int accountNumber;

    public Account(String accountName, String accountPin) {
        this.accountName = accountName;
        this.accountPin = accountPin;
    }

    public void deposit(int amount) {
        if(amount < 0){
            throw new InvalidAmountException("Negative amounts not allowed please");
        }
        if (amount > 0) {
            accountBalance += amount;
        }
    }

    public int checkBalance(String password) {
        if(!this.accountPin.equals(password)){
            throw new InvalidPinException("Obiakpor, Invalid Password");
        }
            return accountBalance;
    }

    public void withdraw(int amount, String password) {
        if (!this.accountPin.equals(password)) {
            throw new InvalidPinException("Obiakpor, Invalid Password");
        }
        if(amount > accountBalance ){
            throw new InsufficientFundException("Insufficienct balance");
        }
        if (amount < accountBalance) {
            accountBalance -= amount;
        }


    }
}