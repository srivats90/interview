package TwoPointers;

import java.util.*;

public class RemoveDup {

	public static void main(String[] args) {
		
		removeDup(new int[] {2, 3, 3, 3, 6, 9, 9});

	}

	private static void removeDup(int[] arr) {
		
		int nonDup = 1;
		
		for(int next = 1; next < arr.length ; next++) {
			if(arr[nonDup - 1] != arr[next]) {
				arr[nonDup] = arr[next];
				nonDup++;
			}
		}
		
//		List<Integer> list = new ArrayList<>();
//		List<Integer> newList = Collections.unmodifiableList(list);
		
		System.out.println(nonDup);
	}

}
