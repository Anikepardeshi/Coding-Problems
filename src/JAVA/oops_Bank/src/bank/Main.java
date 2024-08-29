package bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        BankAccount regularAccount = new BankAccount("123456789", 1000.0);
        SavingsAccount savingsAccount = new SavingsAccount("987654321", 2000.0, 5.0);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("192837465", 5000.0, 7.0);

        System.out.println("Regular Bank Account:");
        bank.showAccountDetails(regularAccount);
        bank.applyInterest(regularAccount);

        System.out.println("\nSavings Account:");
        bank.showAccountDetails(savingsAccount);
        bank.applyInterest(savingsAccount);

        System.out.println("\nFixed Deposit Account:");
        bank.showAccountDetails(fixedDepositAccount);
        bank.applyInterest(fixedDepositAccount);
    }
}
