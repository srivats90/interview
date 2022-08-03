package LeetCodePractice;

import java.util.*;
public class ThreeSum {

	public static void main(String[] args) {
		
		threeSum(new int[] {-1,0,1,2,-1,-4});
	}

	private static void threeSum(int[] arr) {
		
		Arrays.sort(arr);
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int i=0; i < arr.length -2 ; i++) {
			if( i > 0 && arr[i] == arr[i-1])
				continue;
			calSum(arr, i+1, -arr[i], ans);
		}
		
		System.out.println(ans.toString());
	}

	private static void calSum(int[] arr, int left, int target, List<List<Integer>> ans) {
		
		int right = arr.length - 1;
		while(left < right) {
			int temp = arr[left] + arr[right];
			if(temp == target) {
				ans.add(List.of(-target,arr[left] , arr[right] ));
				left++;
				right--;	
				while(left<right && arr[left] == arr[left-1])
					left++;
				while(left <right && arr[right] == arr[right+1])
					right--;
			} else if (temp > target) {
				right--;
			} else 
				left++;
			
		}
			
	}

}
