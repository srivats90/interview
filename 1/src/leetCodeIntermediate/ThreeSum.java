package leetCodeIntermediate;

import java.util.*;

public class ThreeSum {

	public static void threeSum(int[] arr) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		Arrays.sort(arr);
		// -4 -1 -1 0 1 2 
		//logic here is I + J + K = 0 .. or J + K = -I
		
		for(int i = 0; i < arr.length -2; i++) {
			//avoid duplicates
			if(i > 0 && arr[i] == arr[i-1])
				continue;
			// left always starts from next to i.. right is at last.. 
			findTriplet(arr, -arr[i] , i+1, result);
		}
		
		System.out.println(result.toString());
		
	}
	
	public static void findTriplet(int[] arr, int target, int left, List<List<Integer>> result) {
		int right = arr.length - 1;
		while(left < right) {
			if(arr[left] + arr[right] == target) {
				result.add(List.of(-target, arr[left], arr[right]));
				
				left++;
				right--;
				
				//avoid dup
				while(left < right && arr[left] == arr[left -1])
					left++;
				
				while(left < right && arr[right] == arr[right +1])
					right--;
				
			} else if (arr[left] + arr[right] > target) {
				right--;
			} else {
				left++;
			}
		}
	}
	public static void main(String[] args) {
		threeSum(new int[] {-1, 0, 1, 2, -1 ,-4});

	}

}
