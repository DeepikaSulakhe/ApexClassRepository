package com.apex.syncronization;

public class TicketCounter {
	private int availableSeats = 10;
	
	public int getAvailableSeats() {
		return availableSeats;
	}

	public boolean bookSeat(String counterName) {
		if(availableSeats > 0) {
			availableSeats--;
			System.out.println("\n"+counterName+" booked a seat. Remaining: "+availableSeats+"");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return true;
		}else {
			System.out.println("\n"+counterName+": No seats available!");
			return false;
		}	
	}
}
