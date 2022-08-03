package leetcode;

import java.util.*;

public class palindrome {

	public static boolean isPalindrome(int num) {
		
		List<Integer> arr = new ArrayList<>();
		int temp;
		do{
			temp = num%10;
			arr.add(temp);
			num = num/10;
		}while(temp < 10 && num!= 0);
	
		for(int i=0; i<arr.size(); i++)
			System.out.println(arr.get(i));
		int left = 0;
		int right = arr.size() - 1;
		while(left < right) {
//			System.out.println(arr.get(left) );
//			System.out.println( arr.get(right));
			if(arr.get(left) != arr.get(right))
				return false;
			else {
				left++;
				right--;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println("is palindrome " + palindrome.isPalindrome(12321));

	}

}
