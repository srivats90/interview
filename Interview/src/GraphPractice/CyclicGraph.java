package GraphPractice;

import java.util.*;
public class CyclicGraph {

	public static void main(String[] args) {
		char[][] arr = new char[][] {{'i','j'},{'k','i'},{'m', 'k'},{'k','l'},{'o','n'}};
		
		Map<Character, List<Character>> graph = new HashMap<>();
		
		buildGraph(arr, graph);
		
		System.out.println(graph.toString());
		
		System.out.println(hasPath(graph, 'i', 'l', new HashSet<>()));
		
		componentCount(graph);
		
		largestComponent(graph);
		

	}

	private static void largestComponent(Map<Character, List<Character>> graph) {
		
		Set<Character> visited = new HashSet<>();
		int largest = 0;
		
		for(char node : graph.keySet()) {
			largest = Math.max(largest, exploreSize(graph,node,visited));
		}
		
		System.out.println(largest);
		
	}

	private static int exploreSize(Map<Character, List<Character>> graph, char node, Set<Character> visited) {
		
		if(visited.contains(node))
			return 0;
		
		visited.add(node);
		
		int size = 1;
		
		for(char c : graph.get(node)) {
			size += exploreSize(graph, c, visited);
		}
		
		return size;
	}

	private static void componentCount(Map<Character, List<Character>> graph) {
		
		Set<Character> visited = new HashSet<>();
		int count = 0;
		for(char node : graph.keySet()) {
			if(explore(graph, node, visited))
				count++;
		}
		
		System.out.println(count);
	}

	private static boolean explore(Map<Character, List<Character>> graph, char node, Set<Character> visited) {
		
		if(visited.contains(node))
			return false;
		
		visited.add(node);
		
		for(char c : graph.get(node)) {
			explore(graph, c, visited);
		}
		
		return true;
	}

	private static boolean hasPath(Map<Character, List<Character>> graph, char src, char dst, HashSet visited) {
		
		if(src == dst)
			return true;
		
		if(visited.contains(src))
			return false;
		
		visited.add(src);
		
		for(char c : graph.get(src)) {
			if(hasPath(graph, c, dst, visited))
				return true;
		}
		
		return false;
	}

	private static void buildGraph(char[][] arr, Map<Character, List<Character>> graph) {
		
		for(char[] a : arr) {
			if(!graph.containsKey(a[0]))
				graph.put(a[0], new ArrayList<>());
			if(!graph.containsKey(a[1]))
				graph.put(a[1], new ArrayList<>());
			
			List<Character> listA0 = graph.get(a[0]);
			listA0.add(a[1]);
			List<Character> listA1 = graph.get(a[1]);
			listA1.add(a[0]);
		}
		
	}

}
