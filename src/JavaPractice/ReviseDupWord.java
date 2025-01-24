package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReviseDupWord {

	public static void main(String[] args) {

		// Java is the best programmin language java - java : 2

		isDuplicate("java is the best programming language java");

	}

	public static void isDuplicate(String inputString) {
		String words[] = inputString.split(" ");
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for(String word : words) {
			if(wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word)+1);
			}else {
				wordMap.put(word, 1);
			}
		}
		Set<String> wordsInString = wordMap.keySet();
		for(String word : wordsInString) {
			if(wordMap.get(word)>1) {
				System.out.println(word + " : " + wordMap.get(word));
			}
		}
		
		
	}

}
