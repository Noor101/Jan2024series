package JavaPractice;

public class RevisePalindrome {

	public static void main(String[] args) {
		isPalindrome(151);
		isPalindrome(777);
		isPalindrome(7767);


	}

	public static void isPalindrome(int num) {

		int r;
		int sum = 0;
		int t;

		t = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");

		}
	}

}
