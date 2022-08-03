package Subsets;
import java.util.*;
public class Subset {

	public static void main(String[] args) {
		
		findSubset(new int[] {1,5,3});

	}

	private static void findSubset(int[] arr) {
		
		List<List<Integer>> subsets = new ArrayList<>();
		
		//creating the first empty list
		subsets.add(new ArrayList<>());
		
		for(int number : arr) {
			int n = subsets.size();
			
			for(int i=0; i<n ; i++) {
				List<Integer> set = new ArrayList<>(subsets.get(i));
				set.add(number);
				subsets.add(set);
			}
		}
		
		System.out.println(subsets.toString());
		
	}

}
