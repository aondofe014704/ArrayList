package bankTriers;

public class Account {
    private String name;
    private int balance;
    private String pin;
    private int accountNumber;

    public Account(String name, int balance, String pin, int accountNumber){
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public int checkBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Your deposit amount must be more than Zero");
        }
        balance += amount;
    }

    public void withdrawal(int amount, String pin1) {
        if (amount > balance) {
        throw new InsufficientFundException("Insufficient Balance");
        }
        validatePin(pin1);
        validateAmount(amount);
        balance -= amount;
    }

    private void validateAmount(int amount) {
        if(amount > balance) throw new InvalidAmountException("Insufficient Balance");

    }

    private void validatePin(String pin1) {
        if(!pin.equals(pin1)) throw new InvalidPinException("Please Enter Correct Pin");

    }
}
