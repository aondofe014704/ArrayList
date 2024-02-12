public class Account {
    private int balance;

    public void depositMethod(int amount) {
        if (amount > 0)
            balance += amount;
    }

    public int getBalanceMethod() {

        return balance;

    }

    public void withdrawalMethod(int amount) {
        if (!(amount < 0 || amount > balance))
            balance -= amount;
    }

}


