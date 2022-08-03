package leetCodeIntermediate;

import java.util.*;

//Given an integer array nums and two integers k and t, 
//return true if there are two distinct indices i and j in the array 
//such that abs(nums[i] - nums[j]) <= t and abs(i - j) <= k.

public class ContainsDuplicateIII {

	public static boolean dupl(int[] a, int k, int t) {
		
		int left = 0;
		int right = a.length -1;
		
	//	Arrays.sort(a);

		TreeSet<Integer> set = new TreeSet<>();
		
		
		while(left != right) {
			if(Math.abs(a[left] - a[right]) <= t) {
				if(Math.abs(left - right ) <= k) {
					return true;
				}
				left++;
			} else if(Math.abs(a[left] - a[right]) > t) {
				right--;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {

		System.out.println(dupl(new int[] {1,2,3,1}, 3, 0));
		System.out.println(dupl(new int[] {1,0,1,1}, 1, 2));
		System.out.println(dupl(new int[] {1,5,9,1,5,9}, 2, 3));
	
		
	}

}
