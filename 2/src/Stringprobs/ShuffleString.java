package Stringprobs;

import java.util.*;

public class ShuffleString {

	public static String shuffle(String input, int[] indices) {
		
		Map<Integer, Character> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++) {
			map.put(i, input.charAt(i));
		}
		for(int j : indices) {
			sb.append(map.get(j));
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(ShuffleString.shuffle("codeleet", new int[] {4,5,6,7,0,1,2,3}));
	}

}
