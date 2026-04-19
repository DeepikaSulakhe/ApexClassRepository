
public class Loops {

	public static void main(String[] args) {
		System.out.print("1. Multiplication of 7 is: ");
		for(int i = 1; i <= 10; i++) {
			if(i<=9) {
				System.out.print(7*i + ", ");
			}else {System.out.print(7*i);}
		}
		System.out.println();
		
		System.out.print("2. The first number greater than 1 whose square is strictly greater than 500: ");
		int j = 1;
		int square = 0;
		while(square < 500) {
			square = j * j;
			if(square > 500) {
				System.out.print(j);
			}
			j++;
		}
		
		System.out.println();
		
		System.out.println("3. The right angled traingle * is: ");
		
		for(int i = 1; i<=5; i++) {
			for(int k = 1; k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
