package JavaPractice;

public class ReviseFacrtorial {

	public static void main(String[] args) {

		// factorial - 3 : 3*2*1 = 6
		
		System.out.println(fact(3));
		System.out.println(recursiveFact(5));

	}

	public static int fact(int num) {
		if (num == 0)
			return 1;
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		return fact;
		
	}
	
	public static int recursiveFact(int num) {
		if(num==0) {
			return 1;
		}else {
			return num * recursiveFact(num-1);
		}
	}

}
