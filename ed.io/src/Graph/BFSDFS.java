package Graph;

import java.util.*;

public class BFSDFS {

	public static void main(String[] args) {
		
		//directed graph
		Map<Character, char[]> map = new LinkedHashMap<>();
		
		map.put('a',new char[] {'c','b'});
		map.put('b', new char[] {'d'});
		map.put('c', new char[] {'e'});
		map.put('d', new char[] {'f'});
		map.put('e', new char[] {});
		map.put('f', new char[] {});

		Stack<Character> stack = new Stack<>();
		
		stack.push('a');
		
		while(!stack.isEmpty()) {
			Character current = stack.pop();
			System.out.println(current);
			
			char[] cArr = map.get(current);
			for(char c : cArr) {
				stack.push(c);
			}
		}		
		
		Queue<Character> queue = new LinkedList<>();
	//	Queue<Character> b = new BlockingQueue<>();
		
		queue.offer('a');
		while(!queue.isEmpty()) {
			Character current = queue.poll();
			System.out.println(current);
			
			char[] qArr = map.get(current);
			for(char c : qArr) {
				queue.add(c);
			}
		}
		
	}

}
