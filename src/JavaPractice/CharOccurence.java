package JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class CharOccurence {

	public static void main(String[] args) {

		//test - t:2, e:1, s:1
		charOccur("test");
	}
	
	public static void charOccur(String input) {
		
		Map<Character, Integer> charMap = new HashMap<>();
		char[] chrArray = input.toCharArray();
		for(char c : chrArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
		}
		System.out.println(charMap);
	}
	
	
}
