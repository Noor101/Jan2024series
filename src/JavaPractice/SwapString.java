package JavaPractice;

public class SwapString {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		//Swap Strings
		
		a = a +b  ; //HelloWorld
		System.out.println(a);
		
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);

				
	}

}
