import bankTriers.Account;
import bankTriers.InsufficientFundException;
import bankTriers.InvalidAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccouuntTest {
    private Account account;

    @BeforeEach
    public void beginEachWith(){
        account = new Account("Jack", 90,"0147", 0151);
    }
    @Test
    public void testForTheInitialBalanceUponCreation(){
        account.checkBalance();
        assertEquals(0,account.checkBalance());
    }
    @Test
    public void testThatWeCanDepositMoneyInTheAccount(){
        account.checkBalance();
        account.deposit(1200);
        assertEquals(1200,account.checkBalance());
    }
    @Test
    public void depositPositiveAmountTwice_balanceIncreasesTwiceTest(){
        account.checkBalance();
        account.deposit(1000);
        account.deposit(1500);
        assertEquals(2500, account.checkBalance());
    }
    @Test
    public void depositNegativeAmount_throwsException(){
        assertEquals(0,account.checkBalance());
        assertThrows(InvalidAmountException.class, ()-> account.deposit(-2000));
        assertEquals(0,account.checkBalance());
    }
    @Test
    public void testThatWeCanWithdrawMoney(){
        account.checkBalance();
        account.deposit(15000);
        account.withdrawal(3000, "0147");
        assertEquals(12000,account.checkBalance());

    }
    @Test
    public void testThatWithdrawTwice_Balance_Decreases(){
        account.checkBalance();
        account.deposit(10000);
        account.withdrawal(7000,"0147");
        assertEquals(3000, account.checkBalance());
    }
    @Test
    public void testForWithdrawTwice_BalanceDecreases(){
        account.checkBalance();
        account.deposit(4000);
        account.withdrawal(1000, "0147");
        account.withdrawal(1200, "0147");
        assertEquals(1800, account.checkBalance());
    }
    @Test
    public void testForWithdrawalMoreThanBalance_RemainsUnchanged(){
        account.checkBalance();
        account.deposit(5000);
        assertThrows(InsufficientFundException.class,()->account.withdrawal(7000, "0147"));
        assertEquals(5000, account.checkBalance());
    }


}
