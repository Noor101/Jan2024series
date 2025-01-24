package JavaPractice;

public class PrimeNum {

	public static void main(String[] args) {
		// System.out.println("9 is the prime number: " + isPrimeNumber(9));
		// System.out.println("17 is the prime number: " + isPrimeNumber(17));
		System.out.println("11 is the prime number: " + isPrimeNumber(11));
		System.out.println("2 is the prime number: " + isPrimeNumber(2));

		getPrimeNum(20);
	}

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void getPrimeNum(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}

	}
	
	public static boolean isPrimeNum(int num) {
		
		if(num<=1) {
			return false;
		}
		for(int i=2; i<=num; i++) {
			if(num % i ==0) {
				return false;
			}
		}
		return true;
	}

}
