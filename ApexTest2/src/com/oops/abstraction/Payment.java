package com.oops.abstraction;

abstract class Payment {
    double amount; 
	String payerName;
	
	public Payment(double amount, String payerName) {
		super();
		this.amount = amount;
		this.payerName = payerName;
	}
    
    
    public abstract void processPayment();
    
    public void displayReceipt() {
    	System.out.println("The payer is "+payerName+" and the amount is "+amount+" and the payment status is: Success");
    }
}

class CashPayment extends Payment{

	public CashPayment(double amount, String payerName) {
		super(amount, payerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment() {
		System.out.println("Cash payment of Rs. "+amount+" received.");
		
	}
	
}

class CardPayment extends Payment{
	long cardNumber;
	String bankName;
	
	public CardPayment(double amount, String payerName,long cardNumber, String bankName) {
		super(amount, payerName);
		this.cardNumber = cardNumber;
		this.bankName = bankName;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment() {
		String lastDigits = String.valueOf(cardNumber).substring(String.valueOf(cardNumber).length() - 4);
		//System.out.println(String.valueOf(cardNumber));
		System.out.println("Card payment of Rs. " + amount + " processed using " + bankName + " card ending with " + lastDigits);
		
	}
	
}

class UPIPayment extends Payment{
	
	String upiId;
	public UPIPayment(double amount, String payerName, String upiId) {
		super(amount, payerName);
		this.upiId = upiId;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processPayment() {
		System.out.println("Processing...");
		System.out.println("UPI payment successful for Rs. " + amount);
		
	}
	
}

class EMIPayment extends Payment {

    int months;
    public EMIPayment(double amount, String payerName, int months) {
        super(amount, payerName);
        this.months = months;
    }

    @Override
    public void processPayment() {
        double emi = amount / months;
        System.out.println("EMI Payment: Rs. " + emi + " per month for " + months + " months.");
    }
}
