package bank;

public class Bank {
    public void showAccountDetails(Account account) {
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Balance: " + account.getBalance());
    }

    public void applyInterest(Account account) {
        account.calculateInterest();
        System.out.println("Interest applied. New Balance: " + account.getBalance());
    }
}
