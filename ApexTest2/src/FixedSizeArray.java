
public class FixedSizeArray {

	public static void main(String[] args) {
		int[] scores = {85, 92, 78, 90, 88, 76, 95, 89};
		int i = scores.length;
		int maxNum = 0;
		int sum = 0;
		int minNum = Integer.MAX_VALUE;
		for(int n : scores) {
			maxNum = Math.max(maxNum, n);
			minNum = Math.min(minNum, n);
			sum += n;
		}
		System.out.println("Maximum score of the class is: " + maxNum);
		System.out.println("Minimum score of the class is: " + minNum);
		System.out.println("Average score of the class is: " + (double)(sum/i));

	}

}
