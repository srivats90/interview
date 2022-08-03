package Maths;

import java.util.*;

public class GoodPairs {

	public static void main(String[] args) {
		
		
		System.out.println(goodpair(new int[] {1,2,3}));

	}

	private static int goodpair(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i =0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                List<Integer> list = map.get(nums[i]);
                list.add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        int count = 0;
        
        for(Map.Entry<Integer,List<Integer>> e : map.entrySet()){
        	int size = e.getValue().size();
        	int tmp = 0;
        	while(size != 0) {
        		 tmp+= size - 1;
        		 size--;
        	}
        	count += tmp;
        }
		
		return count;
	}

}
