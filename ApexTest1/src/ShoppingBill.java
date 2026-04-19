
public class ShoppingBill {

	public static void main(String[] args) {
		final int[] items = {250,180,45,90,84};
		float subTotal = 0.0f;
		float gst = 0.0f;
		float discount = 0.0f;
		float total = 0.0f;
		for(int n: items) {
			subTotal += n;
		}
		gst = subTotal > 500 ?  subTotal * 5/100 :  subTotal * 0/100;
		discount = (subTotal + gst) > 600 ? (subTotal + gst) * 10/100 : (subTotal + gst) * 0/100;
		total = subTotal - discount;
		
		// String.format() method i have used to get 649.00 like 2 decimals
		System.out.println("Subtotal:Rs. " + String.format("%.2f", subTotal));
		System.out.println("GST(5%):Rs. " + String.format("%.2f", gst));
		// In question you gave like Apply a 10% discount if subTotal > Rs.600 (after GST) but expected o/p for
		// discount was 0.00 which is some misunderstanding i guess.
		System.out.println("Discount:Rs. " + String.format("%.2f", discount));
		
		System.out.println("TOTAL:Rs. " + String.format("%.2f", total));
		
		

	}

}
