package JavaPractice;

public class Prime {

	public static void main(String[] args) {
		System.out.println("7 is the prime number :"+isPrimeNum(7));
		getPrimeNum(10);
	}
	
	public static boolean isPrimeNum(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNum(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNum(i)) {
				System.out.println(i+ " ");
			}
		}
	}
	

}
