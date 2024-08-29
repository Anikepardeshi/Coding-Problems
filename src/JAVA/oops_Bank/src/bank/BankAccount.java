package bank;

public class BankAccount extends Account {

    public BankAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void calculateInterest() {
        // No interest for regular bank account
    }
}
