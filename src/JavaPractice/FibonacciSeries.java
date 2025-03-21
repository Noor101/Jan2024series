package JavaPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//0 1 1 2 3 5 8 13
		
		int i =0;
		int j =1;
		System.out.print(i + " " + j);
		
		for(int x=2; x<=10; x++) {
			int next = i + j;
			i = j;
			j = next;
			System.out.print(" " +next);
		}
		
	}

}
