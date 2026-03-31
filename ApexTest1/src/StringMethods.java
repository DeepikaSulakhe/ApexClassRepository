
public class StringMethods {

	public static void main(String[] args) {
	    String fullName = " alice marie johnson ";
	    StringBuffer sb = new StringBuffer(fullName.trim());
	    
	    String first = sb.substring(0,1).toUpperCase() + sb.substring(1,6);
	    String middle = sb.substring(6,7).toUpperCase() + sb.substring(7,12);
	    String last = sb.substring(12,13).toUpperCase() + sb.substring(13,19);
	    String cleaned = first + middle + last;
	    
	    System.out.println("Cleaned: " + cleaned);
	    System.out.println("First: " + first);
	    System.out.println("Middle: " + middle);
	    System.out.println("Last: " + last);
	    
	    char[] vowels = {'a','A','e','E','i','I','o','O','u','U'};
	    char[] cleanWords = cleaned.toCharArray();
	    int vowelsCount = 0;
	    for(char c : cleanWords) {
	    	for(char v : vowels) {
	    		if(c == v) {
	    			vowelsCount += 1;
	    		}
	    		continue;
	    	}
	    }
	    System.out.println("Vowels " + vowelsCount);
	    StringBuffer sb1 = new StringBuffer(cleaned);
	    System.out.println("Reversed: " +sb1.reverse());
	    

	}

}
