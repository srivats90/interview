package prac;

import java.util.*;
public class ValidParanthesis {

	public static void main(String[] args) {
		
		System.out.println(valid("()[]}"));

	}

	private static boolean valid(String str) {
		
		Map<Character,Character> map = new HashMap<>();
		map.put(')','(');
		map.put(']', '[');
		map.put('}', '{');
		
		Stack<Character> stack = new Stack<>();
		char[] cArr = str.toCharArray();
		
		for(char c : cArr) {
			
			if(map.containsKey(c)) {
				char e = '#';
				if(!stack.isEmpty()) {
					e = stack.pop();
				}
				if(e != map.get(c)) {
					return false;
				}
			} else {
				stack.push(c);
			}
	
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}

}
