package JavaPractice;

public class StringPalindrome {

	public static void main(String[] args) {
		
		isPalindrome("Level");


	}
	
	public static void isPalindrome(String s) {
		
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		if(s.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not palindrome");
		
		}	
		
	}

}
