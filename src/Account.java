public class Account {
    int accountNumber;
    int accountBalance;
    String customerName;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void withdraw(int amount) {
        int newBalance = this.accountBalance - amount;
        if (newBalance > 0) {
            System.out.println("Your are withdrawing " + amount + "your new balance is $" + newBalance);
            this.accountBalance = newBalance;
        } else {
            System.out.println("You do not have enough funds available to withdraw $" + amount);
        }
    }
    public void deposit(int amount) {
        this.accountBalance = this.accountBalance + amount;
        System.out.println("Your new account balance is $" + this.accountBalance);
    }
}
