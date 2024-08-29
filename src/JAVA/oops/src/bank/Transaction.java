package bank;

import java.util.Date;

public class Transaction {
    private Date date;
    private String type; // "Deposit", "Withdrawal", "Interest"
    private double amount;
    private double balanceAfterTransaction;

    public Transaction(String type, double amount, double balanceAfterTransaction) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Type: " + type + ", Amount: " + amount + ", Balance: " + balanceAfterTransaction;
    }
}
