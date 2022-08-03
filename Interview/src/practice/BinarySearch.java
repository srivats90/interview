package practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = { 1, 4, 3, 5, 8, 2, 10 };
		
		Arrays.sort(arr);
		
		int find = 10;
		
		int low = arr[0];
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = low + (high-low+1)/2 ;
			
			if (arr[mid] == find) {
				System.out.println("found");
				break;
			} else if (arr[mid] > find ) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}			
		}
		
		if(low > high) {
			System.out.println("not found");
		}

	}

}
