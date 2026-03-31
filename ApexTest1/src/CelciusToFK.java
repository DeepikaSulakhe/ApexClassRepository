
public class CelciusToFK {

	public static void main(String[] args) {
		int celcius = 15;
		int fahrenheit = 0;
		// we can use either double or float if we take float we have to type cast the result and print. 
		double kelvin = 0;
		fahrenheit = (celcius * 9/5) + 32;
		kelvin =  (celcius + 273.15);
		
		System.out.println("15 Celcius is "+ fahrenheit + "°F");
		System.out.println("15 Celcius is "+ kelvin + "K");

	}

}
