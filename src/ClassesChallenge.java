public class ClassesChallenge {
    public static void main(String[] args) {
        Account myBankAccound = new Account();
        myBankAccound.setAccountNumber(394949);
        myBankAccound.setAccountBalance(100);
        myBankAccound.setCustomerName("Arianna");
        myBankAccound.withdraw(20);
        myBankAccound.withdraw(40);
        myBankAccound.deposit(10);
        myBankAccound.withdraw(300);
    }
}
