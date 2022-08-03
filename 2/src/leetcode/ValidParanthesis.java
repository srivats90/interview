package leetcode;

import java.util.*;
public class ValidParanthesis {

	public static boolean validpara(String input) {
		boolean flag = false;
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i< input.length(); i++) {
			char s = input.charAt(i);
			if(s == '(' || s == '[' || s == '{') {
				map.put(s, i);
			}
			if( s == ')' && map.containsKey('('))
			{
				map.remove('(');
				flag = true;
			}					
			if( s == ']' && map.containsKey('['))
			{
				map.remove('[');
				flag = true;
			}
			if( s == '}' && map.containsKey('{'))
			{
				map.remove('{');
				flag = true;
			}
		}
		if(map.size() != 0)
			flag = false;
		
		return flag;
	}
	public static void main(String[] args) {
		System.out.println(ValidParanthesis.validpara("()[]1"));

	}

}
