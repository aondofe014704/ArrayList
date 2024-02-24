package MyBankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyAccountTest {
    MyAccount myAccount;
    @BeforeEach
    public void setUp(){
        //  myAccount = new MyAccount("Jack Songu","0147");
    }
    @Test
    public void testForDeposit(){
        myAccount.deposit(7000);
        myAccount.checkBalance("0147");
        assertEquals(7000, myAccount.checkBalance("0147"));
    }
    @Test
    public void testForWithdraw_BalanceDecreases(){
        try {
            myAccount.deposit(7000);
            myAccount.checkBalance("0147");
            myAccount.withdraw(4000, "0147");
            assertEquals(3000, myAccount.checkBalance("0147"));
            assertThrows(InsufficientFundsException.class, ()->myAccount.withdraw(100000, "0147"));

        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
    @Test
    public void testForWithdrawal_AboveBalance(){
        try {
            myAccount.deposit(6000);
            myAccount.checkBalance("0147");
            myAccount.withdraw(10000, "0147");
            assertEquals(6000,myAccount.checkBalance("0147"));
            assertThrows(InsufficientFundsException.class, ()->myAccount.withdraw(10000, "0147"));
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
    @Test
    public void testForNoWithdrawalOfNegativeAmount(){
        try {
            myAccount.deposit(2000);
            myAccount.checkBalance("0147");
            myAccount.withdraw(-3000, "0147");
            assertThrows(InvalidAmountException.class, ()->myAccount.withdraw(-3000, "0147"));
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }


}