package JavaPractice;

public class Palindrome {

	public static void main(String[] args) {
		isPalindrome(151);
		isPalindrome(733);



	}
	
	public static void isPalindrome(int num) {
		System.out.println("Given number is : "+num);
		
		int r = 0;
		int sum = 0;
		int t;
		
		t = num;
		
		while(num>0) {
			r = num%10;
			sum =  (sum*10)+r;
			num = num/10;
			
		}
		if(t==sum) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not palindrome number");

		}
		
	}

}
