
public class StudentMarks {

	public static void main(String[] args) {
		int[] marks = {88,76,92,68,95};
		int total = 0; 
		String status = "";
		float percentage = 0.0f;
		for(int n : marks) {
			total += n;
			status = (n>=40) ? "PASS" : "FAIL";
		}
		percentage = (float) total/5;
		System.out.println("Maths: 88  Science: 76  English: 92  History: 68  Java: 95");
		System.out.println("Total "+ total+" "+"Percentage "+ percentage + "%");
		if(percentage >= 90) {
			System.out.println("Grade: A");
		}else if(percentage >= 80) {
			System.out.println("Grade: B");
		}else if(percentage >= 70) {
			System.out.println("Grade: C");
		}else if(percentage >= 60) {
			System.out.println("Grade: D");
		}else if(percentage >= 50) {
			System.out.println("Grade: E");
		}else {
			if(percentage < 50) {System.out.println("Grade: F");}	
		}
		System.out.println("Status: " + status);
		String scholarship = percentage >= 85 ? "Eligible (above 85%)" : "Not Eligible (below 85%)"; 
		System.out.println("Scholarship: " + scholarship);	
	}

}
