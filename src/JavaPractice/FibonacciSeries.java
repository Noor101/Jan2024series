package JavaPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int i =0;
		int j= 1;
		int sum = 0;
		
		//Need to print 0 1 1 2 3 5 8 (i+j)
		
		System.out.print(i +" "+j);
		
		for(int x=2; x<10; x++) {
			
			sum = i+j;
			System.out.print(" "+sum);
			i=j;
			j=sum;
	
		}

	}

}
