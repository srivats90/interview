package leetCodeIntermediate;

import java.util.*;
public class DecodeWays {

	public static void main(String[] args) {
		
		Map<Integer, Character> map = new HashMap<>();	
		
		for(int i=0; i< 26; i++) {
			char temp = (char) ('A' + i);
			map.put( i+1, temp);
		}

//		System.out.println(map);
		
		String s = "2262";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< s.length(); i++){
			int temp1 = Integer.parseInt(String.valueOf(s.charAt(i)));
			if(temp1 < 3) {
				int temp2 = Integer.parseInt(String.valueOf(s.charAt(i+1)));
				if(temp2 < 7) {
					sb.append(map.get(temp1*10 + temp2));
					i++;
				} else {
					sb.append(map.get(temp1));
				}
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
