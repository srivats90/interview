package Graph;

import java.util.*;
public class IslandsCount {

	public static void main(String[] args) {

		char[][] islands = new char[][] { { 'W', 'L', 'W', 'W', 'W' }, { 'W', 'L', 'W', 'W', 'W' },
				{ 'W', 'W', 'W', 'L', 'W' }, { 'W', 'W', 'L', 'L', 'W' }, { 'L', 'W', 'W', 'L', 'L' },
				{ 'L', 'L', 'W', 'W', 'W' } };

		int islandCount = 0;
		Set<String> visited = new HashSet<>();
		Set<String> sizevisited = new HashSet<>();
		for(int row = 0 ; row < islands.length ; row++) {
			for(int col = 0; col < islands[0].length ; col++) {
				if(explore(islands, row , col, visited))
					islandCount++;
			}
		}
		
		//count smallest island
		int minSizeIsland = Integer.MAX_VALUE;
		int maxSizeIsland = Integer.MIN_VALUE;

		for(int row = 0 ; row < islands.length ; row++) {
			for(int col = 0; col < islands[0].length ; col++) {
				int size = exploreSize(islands, row, col, sizevisited);
				if(size > 0) {
					minSizeIsland = Math.min(minSizeIsland, size);
					maxSizeIsland = Math.max(maxSizeIsland, size);
				}
			}
		}
		System.out.println(islandCount);
		System.out.println(minSizeIsland);
		System.out.println(maxSizeIsland);
	}

	private static int exploreSize(char[][] islands, int row, int col, Set<String> sizevisited) {
		
		boolean rowCheck = false;
		boolean colCheck = false;
		if(row >= 0 && row < islands.length)
			rowCheck = true;
		if(col >=0 && col < islands[0].length)
			colCheck = true;
		
		if(!rowCheck || !colCheck){
			return 0;
		}
		
		if(islands[row][col] == 'W')
			return 0;
		
		String pos = row + "," + col;
		if(sizevisited.contains(pos))
			return 0;
		sizevisited.add(pos);
		
		int size = 1;
		
		size += exploreSize(islands, row-1, col,sizevisited );
		size += exploreSize(islands, row+1, col,sizevisited );
		size += exploreSize(islands, row, col-1,sizevisited );
		size += exploreSize(islands, row, col+1,sizevisited );
		
		return size;
	}

	private static boolean explore(char[][] islands, int row, int col, Set<String> visited) {
		
		
		//This is to check while in recursion if we go in all directions in DFS from a node, whether its within the island range
		boolean rowCheck = false;
		boolean colCheck = false;
		if( row >= 0 && row < islands.length)
			rowCheck = true;
		if( col >=0 && col < islands[0].length)
			colCheck = true;
		if(!rowCheck || !colCheck)
			return false;
		
		//check if its water
		if(islands[row][col] == 'W')
			return false;
		
		String pos = row + "," + col;
		if(visited.contains(pos))
			return false;
		visited.add(pos);
		
		//now we are going in all directions.. the first set of checks will help here.
		explore(islands, row+1, col, visited);
		explore(islands, row-1, col, visited);
		explore(islands, row, col+1, visited);
		explore(islands, row, col-1, visited);
		
		return true;
	}

}
