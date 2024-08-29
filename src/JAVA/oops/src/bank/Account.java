package bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

	protected String accountNumber;
    protected double balance;
    protected AccountHolder accountHolder;
    protected List<Transaction> transactions;

    public Account(String accountNumber, double initialBalance, AccountHolder accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolder = accountHolder;
        this.transactions = new ArrayList<>();
    }

    public abstract void calculateInterest();

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount, balance));
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Withdrawal", amount, balance));
        }
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void generateStatement() {
    	System.out.println(accountHolder);
        System.out.println("Statement for Account: " + accountNumber);
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
        System.out.println("Current Balance: " + balance);
    }
}
