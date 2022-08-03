package leetcode;

import java.util.Arrays;
import java.util.*;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {

	public static int[] twoSumMethod(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int i=0;
		int sum = 0;
		while(left < right) {
			sum = (arr[left] + arr[right]);
			if( sum == target)
				return new int[]{left,right};
			else if(sum > target) {
				System.out.println("sum>tar"+sum);
				right--;
			} else if (sum < target) {
				left++;
			}
		}
		return null;
	}
	
	public static int[] search(int arr[], int target) {
		for(int i=0; i < arr.length; i++) {
			for(int j=i+1; j< arr.length; j++) {
				int sum = arr[i] + arr[j];
				if(sum == target)
					return new int[] {i,j};
			}
		}
			
		return null;
	}
	
	public static int[] searchhash(int[] arr, int target) {
		Map<Integer, Integer> hmap = new HashMap<>();
		
		for(int i=0; i < arr.length; i++) {
			if(hmap.containsKey(target - arr[i]))
				return new int[] {i, hmap.get(target - arr[i])};
			
			hmap.put(arr[i], i);
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2,7,1,15};
		int[] resp;
		int[] result = TwoSum.searchhash(new int[] { 2, 7, 1, 15 }, 9);
	    System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");

	}

}
