package Graph;

import java.util.LinkedHashMap;
import java.util.Map;

public class AcyclicRecursiveDFS {

	public static void main(String[] args) {
		Map<Character, char[]> map = new LinkedHashMap<>();
		
		map.put('a',new char[] {'c','b'});
		map.put('b', new char[] {'d'});
		map.put('c', new char[] {'e'});
		map.put('d', new char[] {'f'});
		map.put('e', new char[] {});
		map.put('f', new char[] {});
		
		System.out.println(hasPath(map, 'a', 'f'));

	}

	private static boolean hasPath(Map<Character, char[]> map, char src, char dest) {
		
		if(src == dest)
			return true;
		
		for(char c : map.get(src)) {
			if(hasPath(map, c, dest))
				return true;
		}
		
		return false;
	}

}
