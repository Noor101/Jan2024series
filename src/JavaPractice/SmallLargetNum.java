package JavaPractice;

public class SmallLargetNum {

	public static void main(String[] args) {

		
		int a[] = {12,424,90,7634,232, 893893983, 3, 11};
		
		int largest = a[0];
		int smallest = a[0];
		
		for(int i =1; i<a.length; i++) {
			if(a[i]>largest) {
				largest = a[i];
			}else if(a[i]<smallest)
			{
				smallest = a[i];
				
			}
		} 
		System.out.println("largest number is" + " " + largest);
		System.out.println("smallest number is" + " " + smallest);

	}

}
