//import MyBankApplication.MyAccount;
//import MyBankApplication.MyBank;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class MyBankTest {
//    @Test
//    public void testForCustomerRegistration() {
//        MyBank myBank =  new MyBank();
//        myBank.registerCustomer("Jack","Songu", "0147");
//        assertEquals(1, myBank.numberOfCustomers());
//    }
//    @Test
//    public void testRegisterTwoCustomers_ListOfCustomersIncreases(){
//        MyBank myBank = new MyBank();
//        myBank.registerCustomer("Abbey","Biokes","0147");
//        myBank.registerCustomer("Josh","Johnson","0147");
//        assertEquals(2,myBank.numberOfCustomers());
//    }
//    @Test
//    public void testDeposit_BalanceIncrease(){
//        MyBank myBank = new MyBank();
//        MyAccount account = myBank.registerCustomer("Lionel","Messi","0147");
//        myBank.deposit(700, 1);
//        //myBank.checkBalance(1, "0147");
//        assertEquals(700, myBank.checkBalance(1,"0147"));
//    }
//}