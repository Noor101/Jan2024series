package JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RevDigitCount {

	public static void main(String[] args) {

		// 432434344 - 4 : 5

		digitCount(432434);
	}

	public static void digitCount(long num) {
		
		Map<Long, Integer> numMap = new HashMap<Long, Integer>();
		while(num!=0) {
			long lastDigit = num%10;
			if(numMap.containsKey(lastDigit)) {
				numMap.put(lastDigit, numMap.get(lastDigit)+1);
			}else {
				numMap.put(lastDigit, 1);
			}
			num = num/10;
		}
		
		Set<Long> numbers = numMap.keySet();
		for(Long num1 : numbers) {
			System.out.println(num1 + " : " + numMap.get(num1));
		}


	}

}
