package JavaPractice;

public class ReviseCharOccurence {

	public static void main(String[] args) {
		
		charOccurLen("hello world", 'l');
		charOccur("johnny johnny", 'n');
	}
	
	public static void charOccur(String str, char val) {
		int count =0;
		for(char ch : str.toCharArray()){
			if(ch==val) {
				count++;
			}
		}
		System.out.println(val + " : " +count);
	}
	
	public static void charOccurLen(String str, char val) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==val) {
				count++;
			}
		}
		System.out.println(val + " : " + count);
	}

}
