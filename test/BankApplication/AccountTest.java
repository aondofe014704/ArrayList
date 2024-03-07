package BankApplication;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    public void testToDeposit(){
        Account account = new Account("John Brown", "12");
        account.deposit(1000);
        assertEquals(1000, account.checkBalance("12"));
    }
    @Test
    public void testNotToDepositNegativeValues_BalanceRemainUnchanged(){
        Account account = new Account("John Brown", "12");
        account.deposit(-2000);
        assertThrows(InsufficientFundException.class,()-> account.checkBalance("12"));
    }
    @Test
    public void testToWithdraw(){
        Account account = new Account("John Brown", "12");
        account.deposit(1000);
        account.withdraw(900, "12");
        assertThrows(InvalidPinException.class,()-> account.checkBalance("12"));
    }

}