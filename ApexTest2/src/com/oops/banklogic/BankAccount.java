package com.oops.banklogic;


public class BankAccount {
	
	public String accountNumber;
	public String holderName;
	public String accountType;
	public double balance;
	public int transactionCount;
	
	public BankAccount(String accountNumber, String holderName, String accountType, double balance,int transactionCount) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.accountType = accountType;
		this.balance = balance;
		this.transactionCount = transactionCount;
	} 
	
	private int depositCount;
	private int withdrawalCount;
	private int transferCount;
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			depositCount++;
			transactionCount++;
		}else {
			System.out.println("Cannot process the Deposit");
		}
	}
	
	public void withdrawl(double amount) {
		if(amount > 0 && amount < balance) {
			balance -= amount;
			transactionCount++;
			withdrawalCount++;
			//System.out.println("Withdrawl is procressed.");
		}else {
			System.out.println("Cannot process the Withdrawal");
		}	
	}
	
	public void transfer(BankAccount receiver, double amount) {
	    if (amount <= 0) {
	        System.out.println("Invalid amount");
	        return;
	    }

	    if (this.balance <= amount) {
	        System.out.println("Insufficient balance");
	        return;
	    }
	    
	    balance -= amount;
	    receiver.balance += amount;
	    transferCount++;
	    transactionCount++;
	    System.out.println("Transfer successful of " + amount + " to " + receiver.holderName);
	}
	
	public void displaySummary(BankAccount account) {
	    System.out.println("Account Holder: " + account.holderName);
	    System.out.println("Account Number: " + account.accountNumber);
	    System.out.println("Balance: " + account.balance);

	    System.out.println("Transactions Summary:");
	    System.out.println(depositCount + " Deposits");
	    System.out.println(withdrawalCount + " Withdrawals");
	    System.out.println(transferCount + " Transfers");

	    System.out.println("Total Transactions: " + transactionCount);
	}
	
}


 class BankMain{
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("19093909","Deepika", "Savings",200,0);
		BankAccount acc2 = new BankAccount("19093910", "Anita", "Current", 300,0);
	

		System.out.println("Transaction status of "+acc1.holderName+":");
		acc1.deposit(1000);
		acc1.deposit(200);
		acc1.withdrawl(500);
		acc1.transfer(acc2,100);
		acc1.displaySummary(acc1);
		
		
		System.out.println("\n");
		
		System.out.println("Transaction status of "+acc2.holderName+":");
		acc2.deposit(1000);
		acc2.deposit(200);
        acc2.withdrawl(500);
		acc2.transfer(acc1,300);
		acc2.displaySummary(acc2);
		}

  }