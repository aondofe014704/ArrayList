package TryAgain;

import MyBankApplication.InvalidPinException;

public class AccountApp {
    private String accountName;

    private int accountBalance;
    private String accountPin;
    private int accountNumber;

    public AccountApp(String accountName, String accountPin, int accountNumber) {
        this.accountName = accountName;
        this.accountPin = accountPin;
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount) {
        if(amount < 0) throw new InvalidAmountException("Invalid Amount for deposit");
        accountBalance += amount;
    }
    public int checkBalance(String accountPin) {
        return accountBalance;
    }

    public void withdraw(int amount, String pin) {
        if(!accountPin.equals(pin)) throw new InvalidPinException("Please Enter a Correct Pin");
        if(amount <= 0 ) throw  new InvalidAmountException("Please Enter a Valid Amount.");
        if(accountBalance < amount)throw new InsufficientFundsException("Insufficient Balance.");
        accountBalance -= amount;


    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
