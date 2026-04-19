package com.oops.abstraction;

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Answer: The reason that we cannot instantiate the Payment class is that it is a abstract class and it contains an unimplemented 
 * abstract method which does not have a body but it can be used as reference types for their subclasses
 * The reason why CashPayment class can have a object reference to Payment because it implements the the processPayment() coming from Abstarct class*/
		
		Payment[] payment = new Payment[4];
		Payment cash = new CashPayment(2000, "Dipu");
		Payment card = new CardPayment(1000, "Sonu", 345637382, "Chase");
		Payment upi = new UPIPayment(1500, "Anita", "anita@gmail.com");
		Payment emi = new EMIPayment(25000, "Naina", 12);
		
		payment[0] = cash;
		payment[1] = card;
		payment[2] = upi;
		payment[3] = emi;
		
		for(Payment p : payment) {
			p.processPayment();
			p.displayReceipt();
		}
	}

}
