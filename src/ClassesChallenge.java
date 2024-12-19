public class ClassesChallenge {
    public static void main(String[] args) {
        Account arisAccount = new Account("393994", 500, "Arianna");
        Account myBankAccount = new Account();
        myBankAccount.setAccountNumber("394949");
        myBankAccount.setAccountBalance(100);
        myBankAccount.setCustomerName("Samantha");
        myBankAccount.withdraw(20);
        myBankAccount.withdraw(40);
        myBankAccount.deposit(10);
        myBankAccount.withdraw(300);
        arisAccount.deposit(400);
        arisAccount.withdraw(700);
    }
}
