package leetcode;
import java.util.*;

public class RemoveDuplicates {

	public static int[] removeDuplicates(int[] input) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int i : input) {
			set.add(i);
		}
		int diff = input.length -  set.size() ;
		
		int[] output = new int[set.size()];
		int k = 0;
		for(int j : set) {
			output[k++] = j;
		}
		for(int l=0; l < diff; l++) {
			output[k++] = "_";
		}
		
		return output;
	}
	public static void main(String[] args) {
		int[] output = RemoveDuplicates.removeDuplicates(new int[] {1,1,2});
		
		for(int k : output) {
			System.out.println(k);
		}
		// TODO Auto-generated method stub

	}

}
