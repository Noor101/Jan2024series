package JavaPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ShiftZeroToLeft {

	public static void main(String[] args) {

		int a[] = { 1, 0, 2, 4, 0, 0, 5 };
		System.out.println(Arrays.toString(shiftZeros(a)));
		
		int b[] = { 0, 0, 2, 4, 0, 0, 0 };
		System.out.println(Arrays.toString(shiftZeros(b)));
		
		int c[] = {1};
		System.out.println(Arrays.toString(shiftZeros(c)));


		
		
	}

	public static int[] shiftZeros(int a[]) {
		
		if(a.length==1) {
			return a;
		}

		int left = 0;
		int right = a.length - 1;

		while (left < right) {
			if (a[left] == 0) {
				left++;
			} else if (a[right] != 0) {
				right--;
			} else {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;

			}
		}
		return a;
	}

}
