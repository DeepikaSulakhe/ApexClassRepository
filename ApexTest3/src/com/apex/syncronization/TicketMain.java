package com.apex.syncronization;

public class TicketMain {

	public static void main(String[] args) {
		TicketCounter ticket = new TicketCounter();
		
		Runnable task = ()->{
			for(int i = 0; i<4;i++) {
				ticket.bookSeat(Thread.currentThread().getName());
			}
		};
		
		Thread t1 = new Thread(task,"Counter-A");
		Thread t2 = new Thread(task,"Counter-B");
		Thread t3 = new Thread(task,"Counter-C");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\nBooking closed. Seats remaining: " + ticket.getAvailableSeats());
	}

}
