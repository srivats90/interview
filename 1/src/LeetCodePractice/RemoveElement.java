package LeetCodePractice;

import java.util.*;

public class RemoveElement {

	public static void main(String[] args) {
		
		remove(new int[] {3,2,2,3} , 3);

	}

	private static void remove(int[] arr, int val) {
		
		int left = 0;
		int right = 0;
		
		for(right = 0; right < arr.length; right++) {
			if(arr[right] != val) {
				arr[left] = arr[right];
				left++;
			}
		}
	
		System.out.println(left);
	}

}
