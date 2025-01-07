package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class synchronizedArrayList {

	public static void main(String[] args) {

		
		//1st method collection
		List<String> namesList  = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Tom");
		namesList.add("Naveen");
		namesList.add("Raj");
		
		//To add or remove we dont need explicit synchronization
		//To fetch or traverse we need explicit synchronization
		
		synchronized (namesList) {
			
				Iterator<String> it  = namesList.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
		}
		
		System.out.println("************");
		
		//2nd method - thready safety variant - copyOnWriteArrayList
		
		CopyOnWriteArrayList<String> empNames = new CopyOnWriteArrayList<String>();
		empNames.add("Edward");
		empNames.add("Meenu");
		empNames.add("Vaishnavi");
		empNames.add("Nisha");
		
		//We don't need any explicit synchronization for any operation ;add/remove/traverse
		Iterator<String> it  = empNames.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}
