package Stringprobs;

import java.util.*;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str ="Welcome to Jungle Welcome Welcome";
		
		StringTokenizer st = new StringTokenizer(str);
		Set<String> set = new HashSet<>();
		
		//StringBuilder sb = new StringBuilder();
		
//		while(st.hasMoreTokens()) {
//	//		System.out.println(st.nextToken());
//		}
		boolean already = true;
		String finalStr = "";
		String[] tokens = str.split(" ");
		for(String s : tokens) {
			StringBuilder sb = new StringBuilder();
			sb.append(s + " ");
			sb.reverse();
			finalStr += sb.toString();
			
			already = set.add(s);
			if(already == false) {
				System.out.println(s);
			}
			
		}

//		System.out.println(finalStr);
		
		
		
	}

}
