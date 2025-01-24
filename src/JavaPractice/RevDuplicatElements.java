package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class RevDuplicatElements {

	public static void main(String[] args) {

		String a[] = { "Java", "Interface", "HashMap", "Coding", "Java" };

		// 1. one to many mapping

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					System.out.println("Duplicate element is " + a[i]);
				}
			}
		}

		// 2. using hashSet


		Set<String> store = new HashSet<String>();
		for(String e : a) {
			if(store.add(e)==false) {
				System.out.println("Duplicate element is " + e);
			}
		}
	}

}
