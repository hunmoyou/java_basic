package etc.api.util.arrays.practice;

import java.util.Arrays;
import java.util.Collections;

public class Example {
	public static void main(String[] args) {
		char[] arr = {'J', 'A', 'V', 'A'};
		char[] arr2 = Arrays.copyOf(arr, arr.length);
		char[] arr3 = Arrays.copyOfRange(arr2, 0, 4);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		int [] numbers =  {1, 3, 5, 7, 9, 11, 13};
		System.out.println("9위치는: " + Arrays.binarySearch(numbers, 9));
		
		Integer[]nums = {42, 11, 35, 88, 34, 100};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums, Collections.reverseOrder());
		System.out.println(Arrays.toString(nums));
		
		arr[2] = 'F';
		System.out.println(Arrays.equals(arr, arr2));
	}
}
