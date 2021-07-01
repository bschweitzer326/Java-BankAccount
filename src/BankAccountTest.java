import java.util.Arrays;


public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount();
		BankAccount c = new BankAccount();
		
		a.setCheckingBalance(100.00);
		a.setCheckingBalance(100.00);
		a.setSavingsBalance(300.00);
		
		System.out.println(a.getAccountNumber());
		System.out.println(a.getCheckingBalance());
		System.out.println(a.getSavingsBalance());
		
		a.withdrawChecking(250.00);
		a.withdrawSavings(150.00);
		a.withdrawSavings(10.00);
		
		System.out.println(a.getAccountNumber());
		System.out.println(a.getCheckingBalance());
		System.out.println(a.getSavingsBalance());
		
		a.totalBalance();
		
		b.setCheckingBalance(500.00);
		b.setSavingsBalance(300.00);
		
		System.out.println(b.getAccountNumber());
		System.out.println(b.getCheckingBalance());
		System.out.println(b.getSavingsBalance());
		
		b.withdrawChecking(100.00);
		b.withdrawSavings(50.00);
		
		System.out.println(b.getAccountNumber());
		System.out.println(b.getCheckingBalance());
		System.out.println(b.getSavingsBalance());
		
		b.totalBalance();
		
		c.setCheckingBalance(600.00);
		c.setSavingsBalance(400.00);
				
		System.out.println(c.getAccountNumber());
		System.out.println(c.getCheckingBalance());
		System.out.println(c.getSavingsBalance());
		
		c.withdrawChecking(200.00);
		c.withdrawSavings(200.00);
		
		System.out.println(c.getAccountNumber());
		System.out.println(c.getCheckingBalance());
		System.out.println(c.getSavingsBalance());
		
		c.totalBalance();
				
		System.out.println(BankAccount.getNumberOfAccountsCreated());
		System.out.println(BankAccount.getTotalMoneyStored());		
	}


}
