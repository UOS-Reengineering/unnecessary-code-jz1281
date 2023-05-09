package example.project;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Account> accounts;
    List<Customer> customers;
    List<Branch> branches;

    public Bank() {
        accounts = new ArrayList<>();
        customers = new ArrayList<>();
        branches = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setUpBranch(String branchName, String openingTime, String telephone) {
        branches.add(new Branch(branchName, openingTime, telephone));
        System.out.println("Branch " + branchName + " has been set up.");
    }

    public void setUpNewAccount(Account account, Customer customer) {
        accounts.add(account);
        customers.add(customer);
        System.out.println("Account " + account.getAccountNumber() + " has been set up.");
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer " + customer.getName() + " has been added.");
    }

    public void closeAccount(Account account) {
        account.setBalance(0);
        accounts.remove(account);
        System.out.println("Account " + account.getAccountNumber() + " has been closed.");
    }

    public void closeBranch(Branch branch) {
        branch.setOpeningTime("null");
        branches.remove(branch);
        System.out.println("Branch " + branch.getBranchName() + " has been closed.");
    }

}
