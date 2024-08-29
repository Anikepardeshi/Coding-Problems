package bank;


public class SavingsAccount extends BankAccount{
	
	private double interestRate;
	
	public SavingsAccount(String accountNumber, double initialBalance,AccountHolder accountHolder,double interestRate) {
		super(accountNumber,initialBalance,accountHolder);
		this.interestRate = interestRate;
	}
	
	@Override
	public void calculateInterest() {
		double interest = getBalance()*interestRate/100;
		deposit(interest);
		transactions.add(new Transaction("Interest", interest, getBalance()));
	}
}
