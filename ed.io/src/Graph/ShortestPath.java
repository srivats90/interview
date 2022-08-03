package Graph;
import java.util.*;

public class ShortestPath {
	
	char node;
	int distance;
	
	public ShortestPath(char node, int dis) {
		this.node = node;
		this.distance = dis;
	}

	public char getNode() {
		return node;
	}

	public void setNode(char node) {
		this.node = node;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public static void main(String[] args) {
		
		char[][] edges = new char[][] {{'w','x'}, {'x','y'},{'z','y'},{'z','v'},{'w','v'}};

		Map<Character, List<Character>> graph = new LinkedHashMap<>();
		
		buildGraph(edges, graph);
		
		//Shorted path means use BFS which is queue based.
		System.out.println(shortestPath(graph,'w', 'z'));
	}

	private static int shortestPath(Map<Character, List<Character>> graph, char src, char dst) {
		
		Queue<ShortestPath> queue = new LinkedList<>();
		
		Set<Character> visited = new HashSet<>();
		// visited can also be boolean array..  boolean visted[] = new 

		queue.add(new ShortestPath(src, 0));
		visited.add(src);
		
		
		while(!queue.isEmpty()) {
			ShortestPath current = queue.poll();
			
			if(current.getNode() == dst) {
				return current.distance;
			}
			
			for(char node : graph.get(current.getNode())) {
				if(!visited.contains(node)) {
					visited.add(node);
					queue.add(new ShortestPath(node, current.distance + 1));
				}
			}
			
		}
		
		return -1;
	}

	private static void buildGraph(char[][] edges, Map<Character, List<Character>> graph) {
		
		for(char[] arr : edges) {
			if(!graph.containsKey(arr[0]))
				graph.put(arr[0], new ArrayList<>());
			if(!graph.containsKey(arr[1]))
				graph.put(arr[1], new ArrayList<>());
			
			List<Character> a0List = graph.get(arr[0]);
			a0List.add(arr[1]);
			List<Character> a1List = graph.get(arr[1]);
			a1List.add(arr[0]);		
		}
		
		System.out.println(graph.toString());
	}

}
