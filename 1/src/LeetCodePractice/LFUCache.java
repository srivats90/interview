package LeetCodePractice;

import java.util.*;
public class LFUCache {

	Map<Integer,Pair> cache;
	PriorityQueue<Integer> minHeap;
	int cap;
	
	class Pair{
		int value;
		int count;
		
		public Pair(int val, int c) {
			this.value = val;
			this.count = c;
		}
	}
	
	public LFUCache(int cap) {
		this.cap = cap;
		cache = new HashMap<>();
		minHeap = new PriorityQueue<>(cap, (e1, e2) -> cache.get(e1).count - cache.get(e2).count);
	}
	
	public int get(int key) {
		
		Pair entry = cache.get(key);
		if(entry != null) {
			int count = entry.count;
			cache.put(key, new Pair(key, ++count));
			minHeap.remove(key);
			minHeap.add(key);
			return entry.value;
		}
		
		return -1;
	}
	
	public void put(int key, int val) {
		Pair present = cache.get(key);
		if(present!=null) {
			Pair entry = new Pair(val, present.value + 1);
			cache.put(key, entry);
		} else {
			Pair entry = new Pair(val, 1);
			cache.put(key, entry);
		}
		
		if(cache.size() > cap) {
			Integer k = minHeap.poll();
			cache.remove(k);
		}
		// just to recalculate using the comparator
		minHeap.remove(key);
		minHeap.offer(key);
	}
	
	public static void main(String[] args) {
		
		LFUCache lfu = new LFUCache(2);
		lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
		lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
		System.out.println(lfu.get(1));      // return 1
		                 // cache=[1,2], cnt(2)=1, cnt(1)=2
		lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
		                 // cache=[3,1], cnt(3)=1, cnt(1)=2
		System.out.println(lfu.get(2));      // return -1 (not found)
		System.out.println(lfu.get(3));      // return 3
		                 // cache=[3,1], cnt(3)=2, cnt(1)=2
		lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
		                 // cache=[4,3], cnt(4)=1, cnt(3)=2
		System.out.println(lfu.get(1));      // return -1 (not found)
		System.out.println(lfu.get(3));      // return 3
		                 // cache=[3,4], cnt(4)=1, cnt(3)=3
		System.out.println(lfu.get(4));      // return 4
		                 // cache=[4,3], cnt(4)=2, cnt(3)=3

	}

}
