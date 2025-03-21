package JavaPractice;

public class ReverseStringKeepNumbers {
	
	    public static void main(String[] args) {
	        String input = "test10input786pop18python32";
	        System.out.println("Original: " + input);
	        System.out.println("Reversed: " + reverseKeepingNumbers(input));
	    }

	    public static String reverseKeepingNumbers(String str) {
	        char[] chars = str.toCharArray();
	        int left = 0, right = str.length() - 1;

	        while (left < right) {
	            // Move left pointer to next character (skip digits)
	            if (Character.isDigit(chars[left])) {
	                left++;
	                continue;
	            }

	            // Move right pointer to previous character (skip digits)
	            if (Character.isDigit(chars[right])) {
	                right--;
	                continue;
	            }

	            // Swap characters
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;

	            // Move pointers
	            left++;
	            right--;
	        }

	        return new String(chars);
	    }
	

}
