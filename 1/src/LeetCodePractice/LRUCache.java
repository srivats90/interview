package LeetCodePractice;

import java.util.*;
public class LRUCache {

	Map<Integer, Pair> lruMap;
	PriorityQueue<Integer> minHeap;
	int cap = 0;
	int globalAge = 0;
	
	class Pair{
		int value;
		int age;
		
		public Pair(int value, int age) {
			this.value = value;
			this.age = age;
		}
		
	}
	
    public LRUCache(int capacity) {
        
    	this.cap = capacity;
    	lruMap = new HashMap<>();
    	minHeap = new PriorityQueue<>(capacity ,((e1, e2) -> lruMap.get(e1).age  - lruMap.get(e2).age));
    	
    }
    
    public int get(int key) {
    	Pair entry = lruMap.get(key);
    	if(entry != null) {
    		lruMap.put(key, new Pair(entry.value, ++globalAge) );
    		minHeap.remove(key);
    		minHeap.offer(key);
    		return entry.value;
    	}
    	return -1;
    }
    
    public void put(int key, int value) {
    	
    	Pair entry = new Pair(value, ++globalAge);
    	lruMap.put(key, entry);
    	
    	if(lruMap.size() > cap) {
    		Integer k = minHeap.poll();
    		lruMap.remove(k);
    	}  	
    	minHeap.remove(key);
    	minHeap.add(key);

    }
    
	public static void main(String[] args) {
		
		LRUCache lRUCache  = new LRUCache(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		System.out.println(lRUCache.get(1));    // return 1
		lRUCache.put(3, 3);
		System.out.println(lRUCache.get(2));
		lRUCache.put(4, 4);
		System.out.println(lRUCache.get(1));
		System.out.println(lRUCache.get(3));
		System.out.println(lRUCache.get(4));
		
	}

}
