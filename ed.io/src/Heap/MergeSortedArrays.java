package Heap;

import java.util.*;
import java.util.stream.Collectors;
public class MergeSortedArrays {

	public static void main(String[] args) {
		
		Integer[] result = ninjaAndSortedArrays(new int[] {3, 6, 9}, new int[] {4,10});

		for(Integer i : result) {
			System.out.println(i);
		}
	}
	
    public static Integer[] ninjaAndSortedArrays(int arr1[], int arr2[]) {
    	
    	//List<Integer> list1 = Arrays.asList(arr1);
    	
    	List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
    	List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
    	
    	PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> a - b);
    	
    	for(int i=0; i < list1.size(); i++) {
    		minHeap.add(list1.get(i));
    	}
    	for(int j=0; j < list2.size(); j++) {
    		minHeap.add(list2.get(j));
    	}
    	List<Integer> result = new ArrayList<>();
    	
    	while(!minHeap.isEmpty()) {
    		result.add(minHeap.poll());
    	}
    	Set<Integer> set = new HashSet<>();
    	   	  	
    	
        return result.toArray(Integer[]::new);
        
        
        
    }

}
