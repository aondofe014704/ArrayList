package TryAgain;
import TryAgain.AccountApp;
import java.util.ArrayList;
import java.util.List;

public class BankApp {
    private String name;
    private int noOfAccounts;
    private List<AccountApp> listOfAccounts = new ArrayList<>();


    public BankApp(){

    }

    public int getBalance(int accountNumber, String pin) {
        AccountApp foundAccount = findAccount(accountNumber);
        assert foundAccount != null;
        return foundAccount.checkBalance(pin);
    }



    public AccountApp registerCustomer(String firstName, String lastName, String correctPin) {
        int generated = generate();
        AccountApp accountApp = new AccountApp(firstName + " " + lastName, correctPin, generated);
        listOfAccounts.add(accountApp);
        return accountApp;
    }

    private int generate() {
        return noOfAccounts++;
    }

    public int getListSize() {
        return listOfAccounts.size();
    }

    public void deposit(int amount, int accountNumber) {
        AccountApp accountApp = findAccount(accountNumber);
        assert accountApp != null;
        accountApp.deposit(amount);
    }

    public  AccountApp findAccount(int account) {
        for (AccountApp accountApp : listOfAccounts) {
            if (account == accountApp.getAccountNumber()) ;
            return accountApp;

        }
        return null;
    }
}
