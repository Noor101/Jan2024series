package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
		int i =1;
		for(;i<=10;) {
			System.out.println(i);
			i = i+1;
		}
		
		System.out.println("**************w");

		
		int j = 1;
		do {
			System.out.println(j);
			j++;
			
		}while(j<=10);

		for(int a= 1; a<=20; a++) {
			if(a%2==0) {
				System.out.println(a);
				
			}
		}
		
		System.out.println("**************w");

		
		for(int b=1; b<=20; b++) {
			if(b%2 != 0) {
				System.out.println(b);

			}
		}
		
		int a[] = { 1, 3, 4, 55, 23, 12, 101 };// 7
		
		System.out.println("***************");

		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		ar.remove(2);
		System.out.println(ar.size());
		ar.add(500);
		System.out.println(ar.get(2));
		System.out.println(ar.size());
		ar.remove(0);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		
		System.out.println("*************");
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vennila");
		names.add("Priya");
		names.add("Aishu");
		names.add("Pavani");

		System.out.println(names.size());

		System.out.println(names);
		
		System.out.println("*************");

		//names.clear();
		System.out.println(names.size());
		System.out.println(names);
		
		System.out.println(names.contains("Pavani"));
		System.out.println(names.indexOf("Pavani"));
		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);

		System.out.println("*************");

		HashMap<String, String> ae =  new HashMap<String, String>();
		ae.put("A", "Raj");
		ae.put("B", "Reena");
		ae.put("C", "Reenu");
		
		System.out.println(ae);
		System.out.println(ae.get("C"));

		ae.forEach((k, v) -> System.out.println(k+ ":" +v));
		
		String v1 = "this is my code";
		System.out.println(v1.substring(4));

		






	
	}
	}


