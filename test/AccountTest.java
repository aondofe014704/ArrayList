import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {
    @Test
    public void testThatNegativeNumberBalanceRemainsUnchanged(){
        Account jackAccount = new Account();
        jackAccount.depositMethod(-50000);
        assertEquals(0,jackAccount.getBalanceMethod());
    }
    @Test
    public void testThatDepositReflectInOurBalanceWhenWeDepositMoney(){
        Account jackAccount = new Account();
        jackAccount.depositMethod(7000);
        assertEquals(7000, jackAccount.getBalanceMethod());
    }
    @Test
    public void testThatWeHaveDepositedAgain(){
        Account jackAccount = new Account();
        jackAccount.depositMethod(3000);
        jackAccount.depositMethod(7000);
        jackAccount.depositMethod(8000);
        jackAccount.depositMethod(76000);
        assertEquals(94000, jackAccount.getBalanceMethod());

    }
    @Test
    public void testThatWeCanNegativeWithdrawOfMoneyWillNotChangeBalance(){
        Account jackAccount = new Account();
        jackAccount.withdrawalMethod(-20000);
        assertEquals(0, jackAccount.getBalanceMethod());

    }
    @Test
    public void testThatIHaveWithDrawnMoney(){
        Account jackAccount = new Account();
        jackAccount.withdrawalMethod(1000);
        assertEquals(0, jackAccount.getBalanceMethod());
    }
    @Test
    public void thatWeCanWithdrawMoney(){
        Account jackAccount = new Account();
        jackAccount.depositMethod(1200);
        jackAccount.withdrawalMethod(1000);

        assertEquals(200, jackAccount.getBalanceMethod());

    }
    @Test
    public void thatWeCanWithdrawAgainMoreThanWhatWeHave(){
        Account jackAccount = new Account();
        jackAccount.depositMethod(2000);
        jackAccount.withdrawalMethod(50000);
        assertEquals(2000, jackAccount.getBalanceMethod());
    }

}
