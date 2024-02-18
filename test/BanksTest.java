import bankTriers.Account;
import bankTriers.Banks;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BanksTest {
    private Banks banks;
    private final List<Account> customersAccount = new ArrayList<Account>();

    @BeforeEach
    public void beginEachWith(){
        banks = new Banks("Guranty Trust Bank", customersAccount);
    }
    @Test
    public void registerCustomersTest(){
        Account userOne = banks.registerCustomer("Jack","Songu","1345");
        Account userTwo = banks.registerCustomer("Mesh","Yaro","0146");
        Account userThree = banks.registerCustomer("Obiakpor", "Ikay", "0987");
        Account userFour = banks.registerCustomer("Lionel", "Messi","mess");
        Account userFive = banks.registerCustomer("Mary", "Clark","0147");
    }

}
