package bank;

public class BankAccount extends Account{
	
	public BankAccount(String accountNumber, double initialBalance, AccountHolder accountHolder) {
        super(accountNumber, initialBalance, accountHolder);
    }
	
	@Override
	public void calculateInterest() {
	//	System.out.println("No interest for regular bank account");
	}

}
