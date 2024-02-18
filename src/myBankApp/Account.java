package myBankApp;

import myBankApp.exceptions.InvalidAmountException;
import myBankApp.exceptions.InvalidPinException;

public class Account {
    private String name;
    private int balance;
    private String pin;
    private int accountNumber;
    public void deposit(int amount){
        if (amount<0){
            throw new InvalidAmountException("your deposit must be above zero");
        }
        this.balance = balance+amount;

    }
    public void withdrawal(int amount, String pin){
    pinValidation(pin);
        this.balance = balance - amount;
        this.pin = pin;

    }
    private void pinValidation(String pin){
        if (!this.pin.equals(pin)) {
            throw new InvalidPinException("you entered a wrong pin");
        }
    }
    private void withdrawalValidation(int amount){
        if (amount < balance) {
            throw new InsufficientFundException("insufficient balance");
        }
    }

    public int checkBalance(String pin){
    pinValidation(pin);
    return balance;
    }
}
