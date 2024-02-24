//package MyBankApplication;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MyBank {
//    private String bankName;
//    private int numberOfCustomers;
//    private List<MyAccount>listOfAccounts = new ArrayList<>();
//
//  private int generateAccountNumber(){
//        return numberOfCustomers++;
//    }
//    public MyAccount registerCustomer(String firstName, String lastName, String correctPin) {
//        MyAccount myAccount = new MyAccount(firstName, lastName, correctPin,generateAccountNumber());
//        listOfAccounts.add(myAccount);
//        return myAccount;
//    }
//
//    public int  numberOfCustomers() {
//        return listOfAccounts.size();
//    }
//
//    public void deposit(int amount, int accountNumber) {
//        for (MyAccount listOfAccount : listOfAccounts) {
//            if (listOfAccount.getAccountNumber() == accountNumber)
//                listOfAccount.deposit(amount);
//        }
//
//
//        public int checkBalance(int account, String correctPin){
//            for (MyAccount listOfAccount : listOfAccounts) {
//                if (listOfAccount.getAccountNumber() == accountNumber) {
//                    return listOfAccount.checkBalance(correctPin);
//                }
//            }
//            throw new InvalidAccountException("Account provided is not found");
//
//
//        }
//    }
//}
