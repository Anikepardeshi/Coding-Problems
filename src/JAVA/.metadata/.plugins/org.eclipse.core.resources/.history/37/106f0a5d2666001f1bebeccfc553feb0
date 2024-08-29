package bank;

public class FixedDepositAccount extends Account {
    private double interestRate;

    public FixedDepositAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        balance += balance * interestRate / 100;
    }
}
