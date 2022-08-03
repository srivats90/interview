package Graph;
import java.util.*;
public class BuildCyclicGraph {

	public static void main(String[] args) {
		
		char[][] arr = new char[][] {{'i','j'},{'k','i'},{'m', 'k'},{'k','l'},{'o','n'}};

		Map<Character, List<Character>> map = new LinkedHashMap<>();
		createGraph(arr, map);
		
	//	System.out.println(map.toString());
		
		System.out.println(hasPath(map, 'i', 'o', new HashSet<Character>()));
		
		connectedComponentsCount(map);
		
		largestComponentSize(map);
	}

	private static void largestComponentSize(Map<Character, List<Character>> map) {
		
		Set<Character> visited = new HashSet<>();
		int largest = 0;
		for(char node : map.keySet()) {
			largest = Math.max(largest, exploreSize(map,node,visited));
		}
	//	System.out.println(visited.toString());
		System.out.println(largest);
	}

	private static int exploreSize(Map<Character, List<Character>> map, char node, Set<Character> visited) {
		
		if(visited.contains(node))
			return 0;
		
		visited.add(node);
		
		int size = 1; // to indicated we are starting from an unvisited node
		
		for(char c : map.get(node)) {
			size+= exploreSize(map, c, visited);
		}
//		System.out.println("size " + size);
		return size;
	}

	private static void connectedComponentsCount(Map<Character, List<Character>> map) {
		int count = 0;
		Set<Character> visited = new HashSet<>();
		for(char node : map.keySet()) {
			if(explore(map, node,visited))
				count++;
		}
		
		System.out.println(count);
	}

	private static boolean explore(Map<Character, List<Character>> map, char node, Set<Character> visited) {
		
		if(visited.contains(node))
			return false;
		visited.add(node);
		
		for(char c : map.get(node)) {
			explore(map, c, visited);
		}
		
		return true;
		
	}

	private static boolean hasPath(Map<Character, List<Character>> map, char src, char dst, HashSet<Character> hashSet) {
		
		if(src == dst)
			return true;
		
		if(hashSet.contains(src))
			return false;
		
		hashSet.add(src);
		
		for(Character c : map.get(src)) {
			if(hasPath(map,c ,dst, hashSet)) {
				return true;
			}
		}
		
		return false;
	}

	private static void createGraph(char[][] arr, Map<Character, List<Character>> map) {
		
		for(char[] a : arr) {
			if(!map.containsKey(a[0])) {
				map.put(a[0], new ArrayList<>());
			}
			if(!map.containsKey(a[1])) {
				map.put(a[1], new ArrayList<>());
			}
			List<Character> alist = map.get(a[0]);
			alist.add(a[1]);
			List<Character> a1List = map.get(a[1]);
			a1List.add(a[0]);
		}
	}
}
