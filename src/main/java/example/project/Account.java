package example.project;

public class Account {

    String owner;
    String accountNumber;
    double balance;
    double interest;

    public Account(String owner, String accountNumber, double balance, double interest) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interest = interest;
    }

    public String getOwner() {
        return owner;
    }

    public double getInterest() {
        return interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Object getAccountNumber() {
        return accountNumber;
    }

    public double obtainBalance() {
        return balance;
    }

    public void addInterest() {
        double value = balance * interest;
        balance = balance + value;
    }

}
