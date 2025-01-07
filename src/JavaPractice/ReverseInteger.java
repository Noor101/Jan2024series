package JavaPractice;

public class ReverseInteger {

	public static void main(String[] args) {
		
		// O/p 54321
		
		int num = 12345;
		int rev= 0;
		
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("Reverse num is :" + rev);
		
		long x = 123566;
		StringBuffer sf = new StringBuffer(String.valueOf(x)).reverse();
		System.out.println(sf);
	
		int x1= 12345/10;
		System.out.println(x1);

	}

}
