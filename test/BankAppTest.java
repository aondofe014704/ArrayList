import TryAgain.BankApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAppTest {
    private BankApp bankApp;

    @BeforeEach
    public void setUp(){
        bankApp = new BankApp();
    }
    @Test
    public void testToRegisterACustomer(){
        bankApp.registerCustomer("Jack","Jackson","69");
        assertEquals(1, bankApp.getListSize());
    }
    @Test
    public void testToRegisterTwoCustomers_ListOfCustomersIncreases(){

        bankApp.registerCustomer("James", "Brown", "69");
        bankApp.registerCustomer("kate","luck","69");
        assertEquals(2, bankApp.getListSize());
    }
    @Test
    public void testForDeposit_BalanceIncreases(){

        bankApp.registerCustomer("Justin", "Caleb", "69");
        bankApp.deposit(7000, 1);
        assertEquals(7000, bankApp.getBalance(1,"69"));

    }


}
