package LeetCodePractice;

import java.util.*;
public class GenerateParanthesis {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		int n = 3;
		
		backTrack(list, "", 0, 0, n);
		
		System.out.println(list.toString());
	}

	//back track is used in generating , permutation, combination type of problems.
	//it usually takes a list and adds when the exit criteria is met
	private static void backTrack(List<String> list, String current, int open, int close, int n) {
		
		//n*2 because 3 pairs of brackets means length is 6
		if(current.length() == n * 2) {
			list.add(current);
			return;
		}
		//open brackets cannot be more than n
		if(open < n) {
			backTrack(list , current + "(" , open + 1, close, n);
		}
		//close brackets cannot be more than open else order might change
		if(close < open) {
			backTrack(list , current + ")", open, close + 1, n);
		}
		
	}

}
