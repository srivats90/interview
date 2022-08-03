package Maths;
import java.util.*;
public class Pascal {

	public static void main(String[] args) {
		
		int n = 4;
		
		List<List<Integer>> triangle = new ArrayList<>();
		
		triangle.add(new ArrayList<>(1));
		triangle.get(0).add(1);
		
		for(int i = 1 ; i < n ; i++) {
			List<Integer> eachRow = new ArrayList<>();
			
			//each row first and last element is 1
			eachRow.add(1);
			
			List<Integer> prevRow = triangle.get(i -1);
			
			for(int j = 1; j <= i-1 ; j++) {
				eachRow.add(prevRow.get(j-1) + prevRow.get(j));
			}
			
			eachRow.add(1);
			triangle.add(eachRow);
		}
		
		System.out.println(triangle.toString());

	}

}
