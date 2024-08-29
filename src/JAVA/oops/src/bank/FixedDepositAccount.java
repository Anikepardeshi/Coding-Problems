package bank;

public class FixedDepositAccount extends Account {
    private double interestRate;

    public FixedDepositAccount(String accountNumber, double initialBalance, AccountHolder accountHolder, double interestRate) {
        super(accountNumber, initialBalance, accountHolder);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        transactions.add(new Transaction("Interest", interest, balance));
    }
}
