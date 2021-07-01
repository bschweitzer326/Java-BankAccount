import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private Double checkingBalance;
	private Double savingsBalance;
	public static int numberOfAccountsCreated = 0;
	public static Double totalMoneyStored = 0.0;
	
	private static String tenRandom() {  //needs to be private
		String Z = "";
		for ( int i=0; i<10; i++ ) {
			Random r = new Random();
			int x = r.nextInt(10);
			Z = Z + x;
		}
		return Z;  
    }
	
// --------------------------------------------------------------------------------
//				bank account
//--------------------------------------------------------------------------------	
	
	public BankAccount() {
		this.accountNumber = BankAccount.tenRandom();
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		numberOfAccountsCreated++;
	}

// --------------------------------------------------------------------------------
//					withdraw
//--------------------------------------------------------------------------------	

	public Double withdrawChecking(Double withdrawAmount) {
		if(this.checkingBalance < withdrawAmount) {
			System.out.println("Insufficient Funds");
		}
		else {
			this.checkingBalance -= withdrawAmount;
			totalMoneyStored -= withdrawAmount;
		}
		return this.checkingBalance;
	}
	
	public Double withdrawSavings(Double withdrawAmount) {
		if(this.savingsBalance < withdrawAmount) {
			System.out.println("Insufficient Funds");
		}
		else {
			this.savingsBalance -= withdrawAmount;
			totalMoneyStored -= withdrawAmount;
		}
		return this.savingsBalance;
	}
	
// --------------------------------------------------------------------------------
//					account #
//--------------------------------------------------------------------------------			
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
// --------------------------------------------------------------------------------
//						checking
//--------------------------------------------------------------------------------	
	
	public Double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance += checkingBalance;
		totalMoneyStored += checkingBalance;
	}
	
// --------------------------------------------------------------------------------
//    					savings
//--------------------------------------------------------------------------------
	
	public Double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(Double savingsBalance) {
		this.savingsBalance += savingsBalance;
		totalMoneyStored += savingsBalance;
	}
	
// --------------------------------------------------------------------------------
//    			total balance
//--------------------------------------------------------------------------------
	
	public Double totalBalance() {
        Double totalbal = this.checkingBalance + this.savingsBalance;
        System.out.println(totalbal);
        return totalbal;
    } 
	
// --------------------------------------------------------------------------------
//	                   # accounts
//--------------------------------------------------------------------------------
	
	public static int getNumberOfAccountsCreated() {
		return numberOfAccountsCreated;
	}

	public static void setNumberOfAccountsCreated(int numberOfAccountsCreated) {
		BankAccount.numberOfAccountsCreated = numberOfAccountsCreated;
	}
	
// --------------------------------------------------------------------------------
//								 $ stored
// --------------------------------------------------------------------------------
	
	public static Double getTotalMoneyStored() {
		return totalMoneyStored;
	}

	public static void setTotalMoneyStored(Double totalMoneyStored) {
		BankAccount.totalMoneyStored = totalMoneyStored;
	}
	
	

	

	
	
	
	
	
	
	
	
	
	
	
}
