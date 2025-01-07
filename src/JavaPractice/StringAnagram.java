package JavaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("listen", "SIlent"));
		System.out.println(isAnagram("pena", "anpe"));


	}
	
	public static boolean isAnagram(String s1, String s2) {
		
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		
		if(s1.length() != s2.length()) {
			return false;
		}else {
			char c1[] = s1.toLowerCase().toCharArray();
			char c2[] = s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			return Arrays.equals(c1, c2);
		}
		
	}

}
