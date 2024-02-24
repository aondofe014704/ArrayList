package MyBankApplication;

public class MyAccount {
    private String accountName;
    private int accountBalance;
    private final String accountPin;
    private int accountNumber;

    public MyAccount(String firstName,String lastName , String accountPin, int accountNumber) {
        this.accountName = firstName +" "+ lastName;
        this.accountPin = accountPin;
        this.accountNumber = accountNumber;

    }


    public void deposit(int amount) {

        accountBalance += amount;
    }

    public int checkBalance(String pin) {
       if (checkPin(pin)) throw new InvalidPinException("Invalid Pin");
       return accountBalance;
    }

    private boolean checkPin(String pin) {

        return !this.accountPin.equals(pin);

    }

    public void withdraw(int amount, String accountPin){
        if(amount < accountBalance) throw new InvalidAmountException("You Can't withdraw a Negative amount, please put a valid amount");
        if (checkPin(accountPin))  throw new InvalidPinException("Invalid Pin ");
       if(amount>accountBalance) throw new InsufficientFundsException("Insufficient Fund");

       accountBalance  -= amount;

    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
