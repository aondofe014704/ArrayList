package bankTriers;
import java.util.List;

public class Banks {
    private String name;
    private List<Account> customersAccount;

    public Banks (String name, List<Account> customersAccount) {
        this.name = name;
        this.customersAccount = customersAccount;
    }

    public Account registerCustomer(String firstName, String lastName, String newPin) {
    Account account = new Account(firstName + " " + lastName, 0, newPin, customersAccount.size()+1);
    customersAccount.add(account);
    return account;
    }
}
