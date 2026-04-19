import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		System.out.println("Choose and enter the color from Red, Yellow, Green");
		
		Scanner sc = new Scanner(System.in);
		
		String light = sc.nextLine();
		
		switch(light) {
			case "Red": 
				System.out.println("Action: STOP — Do not proceed.");
				break;
			case "Yellow": 
				System.out.println("Action: CAUTION — Prepare to stop.");
				break;
			case "Green":
				System.out.println("Action: GO — Proceed safely.");
				break;
			
		}
		System.out.println("Safe to Go: " + (light.equals("Green") ? true: false));
		sc.close();

	}

}
