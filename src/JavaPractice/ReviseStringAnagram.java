package JavaPractice;

import java.util.Arrays;

public class ReviseStringAnagram {

	public static void main(String[] args) {

		// Listen - silent
		// act - cat

		System.out.println(isAnagram("Listen", "Silent"));
		System.out.println(isAnagram("Pant", "Tanp"));

	}

	public static boolean isAnagram(String str1, String str2) {

		String s1 = str1.replaceAll("\\s", "");
		String s2 = str1.replaceAll("\\s", "");

		if (str1.length() != str2.length()) {
			return false;
		} else {

			char c1[] = s1.toLowerCase().toCharArray();
			char c2[] = s2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}

	}

}
