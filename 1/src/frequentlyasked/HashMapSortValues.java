package frequentlyasked;

import java.util.*;
import java.util.Map.Entry;
public class HashMapSortValues {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 5);
		map.put("b", 3);
		map.put("c", 8);

		List<Map.Entry<String, Integer>> llist = new LinkedList<>(map.entrySet());
		
		Collections.sort(llist, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		Map<String, Integer> newMap = new LinkedHashMap<>();
		
		llist.forEach(s -> newMap.put(s.getKey(), s.getValue()));
		
		newMap.forEach((k,v) -> System.out.println( k + v));

	}

}
