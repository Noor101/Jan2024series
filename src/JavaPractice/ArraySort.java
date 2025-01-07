package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 4, 5, 5, 6, 7, 7, 9, 4, 3));
		//Using Hashset
		LinkedHashSet<Integer> linkedIntSet  = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> sortedlist  = new ArrayList<Integer>(linkedIntSet);
		System.out.println(sortedlist);
		
		//Using Stream
		
		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 4, 5, 5, 6, 7, 7, 9, 4, 3));
		List<Integer> sortIntList = 	marks.stream().distinct().collect(Collectors.toList());
		System.out.println(sortIntList);

				
		
	}

}
