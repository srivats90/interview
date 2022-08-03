package slidingwindow;

import java.util.*;
// Given an array, find the average of all subarrays of ‘K’ contiguous elements in it.
//Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5

public class AverageOfSubArr {

	public static void main(String[] args) {
		
		avgSub(new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2}, 5);

	}

	private static void avgSub(int[] arr, int k) {
		
		int start = 0;
		List<Double> list = new ArrayList<>();
		double avg = 0.0f;
		double sum = 0;
		
		for(int end =0; end < arr.length; end++) {
			sum += arr[end];
			
			if(end >= k-1) {
				avg = sum/k;
				list.add(avg);
				sum = sum - arr[start];
				start++;
				
			}
		}
		
		System.out.println(list.toString());
		
	}

}
