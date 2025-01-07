package JavaPractice;

public class StringReverse {

	public static void main(String[] args) {

		
		//1. using for loop
		String s = "Selenium";
		String rev = "";
		int len = s.length();
		for(int i=len-1; i>=0; i--) {
			rev = rev +s.charAt(i);
		}
		System.out.println(rev);
	}
	
//	//2. using StringBuffer
//	
//	StringBuffer sf = new StringBuffer(s);
//	System.out.println(sf.reverse());
//	}

}
