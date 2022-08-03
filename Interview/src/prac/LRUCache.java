package prac;

import java.util.*;

public class LRUCache {

	Map<String, Pair> cache;
	PriorityQueue<String> minHeap;
	int globalCount;
	int cap;

	public LRUCache(int cap) {
		this.cap = cap;
		cache = new HashMap<>();
		this.globalCount = 0;
		minHeap = new PriorityQueue<>(cap, (e1, e2) -> cache.get(e1).getCount() - cache.get(e2).getCount());
	}

	public int get(String input) {
		if (cache.containsKey(input)) {
			Pair p = cache.get(input);
			cache.put(input, new Pair(p.value, ++globalCount));
			minHeap.remove(input);
			minHeap.add(input);
		}
		return -1;
	}

	public void put(String input, int value) {

		cache.put(input, new Pair(value, ++globalCount));
		
		if(cache.size() > this.cap) {
			String key = minHeap.poll();
			cache.remove(key);
		}
		minHeap.remove(input);
		minHeap.add(input);

	}
	
	public void displayCache() {
		cache.forEach((k,v) -> System.out.println(k + v));
	}

	public static void main(String[] args) {
		
		LRUCache obj = new LRUCache(2);
		
		obj.put("krish", 30);
		obj.put("goms", 28);
		obj.get("krish");
		obj.put("Haasni", 11);
		
		obj.displayCache();

	}

}

class Pair {
	int value;
	int count;

	public Pair(int value, int count) {
		this.value = value;
		this.count = count;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Pair [value=" + value + ", count=" + count + "]";
	}

}
