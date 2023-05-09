package example.project;

public class Client {

    public static void feature1() {
        System.out.println("Feature 1");
        String counter;

        Bank bank = new Bank();
        bank.setUpBranch("London", "09:00", "020 7946 0000");
        bank.setUpBranch("Sheffield", "09:00", "0161 123 4567");

        Account account = new Account("Mr Reengineering", "12345678", 1000, 0.01);
        Customer customer = new Customer("Mr Reengineering", "07700 900 982");
        bank.setUpNewAccount(account, customer);

        System.out.println("The opening times for all branches are as follows:");
        for (Branch branch : bank.getBranches()) {
            System.out.println("\t- " + branch.getBranchName() + ": " + branch.getOpeningTime() + " (contact: " + branch.getTelephone() + ")");
        }

        System.out.println("The list of customers is as follows:");
        for (Customer c : bank.getCustomers()) {
            System.out.println("\t- " + c.getName() + " (" + c.getPhoneNumber() + ")");
            for (Account a : bank.getAccounts()) {
                if (a.getOwner().equals(c.getName())) {
                    System.out.println("\t\t- Account " + a.getAccountNumber() + " (balance: " + a.getBalance() + ")");
                }
            }
        }
    }

    public static void feature2() {
        System.out.println("Feature 2");
        Bank bank = new Bank();
        Customer customer = new Customer("Mr Reengineering", "07700 900 982");
        bank.addCustomer(customer);

        System.out.println("The list of customers is as follows:");
        for (Customer c : bank.getCustomers()) {
            System.out.println("\t- " + c.getName() + " (" + c.getPhoneNumber() + ")");
            for (Account a : bank.getAccounts()) {
                if (a.getOwner().equals(c.getName())) {
                    System.out.println("\t\t- Account " + a.getAccountNumber() + " (balance: " + a.getBalance() + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        feature1();
        feature2();
    }

}
