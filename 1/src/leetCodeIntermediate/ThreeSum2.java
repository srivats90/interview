package leetCodeIntermediate;

import java.util.*;

public class ThreeSum2 {

	public static void main(String[] args) {
		
		threesum(new int[] {-2, 0 ,1, 3}, 2);

	}

	private static void threesum(int[] arr, int target) {
		
		Arrays.sort(arr);
		int count = 0;
		
		for(int i=0; i< arr.length -2; i++) {
			count += searchPair(arr, target-arr[i], i);
		}
		
		System.out.println(count);
	}

	private static int searchPair(int[] arr, int target, int i) {
		
		int count = 0;
		int left = i+1;
		int right = arr.length - 1;
		while(left < right) {
			if(arr[left] + arr[right] < target) {
				count += right - left;
				left++;
				//right--;
			}
			else
				right--;
				
		}
		
		return count;
	}

}
