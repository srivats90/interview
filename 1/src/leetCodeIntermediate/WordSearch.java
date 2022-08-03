package leetCodeIntermediate;

import java.util.*;
public class WordSearch {

	public static void main(String[] args) {
		
		char[][] board = {{'A','B','C','E'},{'S','F','S'},{'A','D','E','E'}};
		
		String word = "ABCCED";
		Map<Character,Integer> map = new HashMap<>();
		
		for(char[] arr : board) {
			for(char a : arr ) {
				map.put(a, map.getOrDefault(a, 0) + 1);
			}
		}
		
		for(char b : word.toCharArray()) {
			if(map.containsKey(b)) {
				int count = map.get(b) ;
				if(count == 1)
					map.remove(b);
				else
					map.put(b, count - 1);
			} else 
				System.out.println(false);
		}
		System.out.println(true);
	}

}
