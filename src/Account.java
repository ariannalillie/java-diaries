public class Account {
    String accountNumber;
    int accountBalance;
    String customerName;
    // If a class contains no constructor declarations
    // then a constructor is implicitly declared
    // This constructor has no params - often called the no-args constructor
    // constructors have the same name as the class and no return type
    public Account() {
    System.out.println("Empty constructor called");
    }
    public Account(String accountNumber, int accountBalance, String customerName) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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
            System.out.println(customerName + ", Your are withdrawing $" + amount + " your new balance is $" + newBalance);
            this.accountBalance = newBalance;
        } else {
            System.out.println(customerName + ", You do not have enough funds available to withdraw $" + amount);
        }
    }
    public void deposit(int amount) {
        this.accountBalance = this.accountBalance + amount;
        System.out.println(customerName + ", Your new account balance is $" + this.accountBalance);
    }
}
