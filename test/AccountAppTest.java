import TryAgain.AccountApp;
import TryAgain.InsufficientFundsException;
import TryAgain.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountAppTest {
    @Test
    public void testForDeposit_BalanceIs_Zero(){
        AccountApp accountApp = new AccountApp("John", "69",1);
        accountApp.checkBalance("69");
        assertEquals(0, accountApp.checkBalance("69"));
    }
    @Test
    public void testForNoNegativeDeposit_BalanceIsUnchanged(){
        AccountApp accountApp = new AccountApp("John", "69", 1);
        assertThrows(InvalidAmountException.class, ()-> accountApp.deposit(-7000));
        assertEquals(0,accountApp.checkBalance("69"));
    }
    @Test
    public void testToDeposit_Balance_Increases(){
        AccountApp accountApp = new AccountApp("John", "69", 1);
        accountApp.deposit(5000);
        assertEquals(5000, accountApp.checkBalance("69"));
    }
    @Test
    public void testToDepositTwice(){
        AccountApp accountApp = new AccountApp("John", "69", 1);
        accountApp.deposit(7000);
        accountApp.deposit(1000);
        assertEquals(8000, accountApp.checkBalance("69"));
    }
    @Test
    public void testToDeposit_WithdrawTwice_Balance_Decreases() {
        AccountApp accountApp = new AccountApp("John", "69", 1);
        accountApp.deposit(7000);
        accountApp.withdraw(1000, "69");
        accountApp.withdraw(500, "69");
        assertEquals(5500, accountApp.checkBalance("69"));
    }
    @Test
    public void testForDeposit_No_NegativeAmountWithdraw_BalanceRemainTheSame(){
        AccountApp accountApp = new AccountApp("John", "69", 1);
        accountApp.deposit(2000);
        assertThrows(InvalidAmountException.class,()-> accountApp.withdraw(-1000,"69"));
        assertEquals(2000, accountApp.checkBalance("69"));
    }
    @Test
    public void testForWithdraw_Above_BalanceNotAllowed(){
        AccountApp accountApp = new AccountApp("John", "69", 1);
        accountApp.deposit(700);
        assertThrows(InsufficientFundsException.class,()-> accountApp.withdraw(1000,"69"));
        assertEquals(700, accountApp.checkBalance("69"));

    }

}
