
public class StringManipulation {

	public static void main(String[] args) {
		String s = "deepika tekale";
		int vowelCount = countVowels(s);
		System.out.println("1. The number of vowels is: "+vowelCount);
		
		String reverseStr = reverseString(s);
		System.out.println("2. Reversed String is : "+reverseStr);
		
		String palindromeStr = "malayalam";
		Boolean palindrome = isPalindrome(palindromeStr);
		System.out.println("3. is " +palindromeStr +" a Palindrome: " + palindrome);
		
		String exampleWord = "This is Java course. I like to code in Java. I want to code in Java";
		int countWord = countOccurrences(exampleWord,"Java");
		System.out.println("4. Number of occurances of "+ "Java" +" in given word: " + countWord);

	}
	private static int countVowels(String s) {
		int count = 0;
		char[] vowels = {'a','e','i','o','u'};
		for(int i = 0; i < s.length();i++) {
			for(int j = 0; j < vowels.length;j++) {
				if(s.charAt(i) == vowels[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	private static String reverseString(String s) {
		char[] arr = s.toCharArray();
		int l = 0 ; int r = arr.length-1;
		while(l<r && r>l) {
			char temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		
		return new String(arr);
	}
	
	private static Boolean isPalindrome(String palindromeStr) {
		String reverse = reverseString(palindromeStr);
		if(reverse.equals(palindromeStr)) {
			return true;
		}
		return false;
	}
	
	private static int countOccurrences(String exampleWord, String word) {
		int count = 0;
		exampleWord = exampleWord.replaceAll("[^a-zA-Z ]", "");
		String[] words = exampleWord.split(" ");
		for(String letter: words) {
			if(letter.equals(word)) {
				count++;
			}
		}
		return count;
	}

}
