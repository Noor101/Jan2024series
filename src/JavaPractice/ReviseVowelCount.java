package JavaPractice;

public class ReviseVowelCount {

	public static void main(String[] args) {
		
		String s = " I love Testing";
		int vCount = 0;
		for(int i=0; i<s.length(); i++) {
			if(isVowel(s.charAt(i))) {
				vCount++;
			}
		}
		System.out.println(vCount);

	}
	
	public static boolean isVowel(char t) {
		return t =='a' ||t =='e' ||t =='i' ||t =='o' ||t =='u' ||t =='A' ||t =='E' ||t =='I' ||t =='O' ||t =='U';
	}

}
