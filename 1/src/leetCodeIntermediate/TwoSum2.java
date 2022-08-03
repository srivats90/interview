package leetCodeIntermediate;

import java.util.*;

public class TwoSum2 {

	public static int[] twoSum(int[] arr, int target){
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			if(arr[left] + arr[right] == target)
				return new int[] {left, right};
			else if(arr[left] + arr[right] > target)
				right--;
			else
				left++;
		}
		
		return new int[] {-1 , -1};
	}
	public static void main(String[] args) {
		
		int[] arr = twoSum(new int[] {2,3,4} , 6);
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
