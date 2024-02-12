package chapter3Test;

import chapter3.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testThatAccountExist(){
        Account account = new Account();
        assertNotNull(account);
    }
    @Test
    public void testThatWeCanDeposit(){
        Account account = new Account();
        account.deposit(7000.00);
        assertEquals(7000,account.checkBalance());
    }
    @Test
    public void testThatUserCannotDepositANegativeAmount(){
        Account account  = new Account();
        account.deposit(-3000);
        assertEquals(0.0,account.checkBalance());
    }
    @Test
    public void testThatUserCanNotWithdrawANegativeAmount(){
       Account account = new Account();
       account.withdrawal(-2000);
       assertEquals(0.0, account.checkBalance());

    }
    @Test
    public void testThatUserCanWithdrawMoney(){
        Account account = new Account();
        account.deposit(10000);
        account.withdrawal(5000);
        assertEquals(5000, account.checkBalance());

    }
    @Test
    public void testThatWeCanSetUserName(){
        Account account = new Account();
        account.setName("Jack Songu Aondofe");
        assertEquals("Jack Songu Aondofe", account.getName());
    }
    @Test
    public void testThatWeCanSetAccountNumber(){
        Account account = new Account();
        account.setAccountNumber("36303210186");
        assertEquals("36303210186", account.getAccountNumber());
    }
}
