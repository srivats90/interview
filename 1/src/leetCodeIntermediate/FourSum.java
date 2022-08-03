package leetCodeIntermediate;

import java.util.*;

public class FourSum {

	static List<List<Integer>> result = new ArrayList<>();
	
	public static void four(int[] arr , int target) {
		
		Arrays.sort(arr);
		
		for(int i=0; i < arr.length -3; i++) {
			if( i > 0 && arr[i] == arr[i-1])
				continue;
			
			for(int j = i+1 ; j < arr.length -2; j++) {
				if( j > 0 && arr[j] == arr[j-1])
					continue;
				
				searchPair(arr, target , i , j);
			}
		}
		System.out.println(result.toString());
	}		

	private static void searchPair(int[] arr, int target, int i, int j) {
		int left = j +1;
		int right = arr.length - 1;
		
		while(left < right) {
			int sum = arr[i] + arr[j] + arr[left] + arr[right];
			if(sum == target) {
				result.add(List.of(arr[i], arr[j], arr[left], arr[right]));
				left++;
				right--;
				
				while(left < right && arr[left] == arr[left-1])
					left++;
				while(left < right && arr[right] == arr[right+1] )
					right--;
			
			} else if (sum > target)
				right--;
			else
				left++;
		}
		
	}


	public static void main(String[] args) {
		
		four(new int[] {1, 0, -1, 0, -2, 2} , 0);

	}

}
