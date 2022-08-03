package DynamicProgramming;

import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		
		Map<Integer, Long> memoMap = new HashMap<>();
		
		System.out.println(fib(91, memoMap));

	}

	private static long fib(int n, Map<Integer, Long> memoMap) {
		
		if(memoMap.containsKey(n))
			return memoMap.get(n);
		
		if(n <= 2)
			return 1;
		
		memoMap.put(n, fib(n-1 , memoMap) + fib(n-2, memoMap));
		
		return memoMap.get(n);
	}

}
