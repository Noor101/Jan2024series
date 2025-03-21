package JavaPractice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		//20 12 7 89 24 13 - have to sort
		int[] a = {20, 12, 7, 89, 24, 13};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));

	}
	
	public static void bubbleSort(int[] a) {
		
		for(int i =0; i<a.length; i++) {
			for(int j=1; j<a.length-i; j++) {
				if(a[j]<a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1]=temp;
					
				}
			}
		}
	}



}
