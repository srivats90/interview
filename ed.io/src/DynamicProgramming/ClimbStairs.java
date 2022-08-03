package DynamicProgramming;

import java.util.*;
public class ClimbStairs {

	public static void main(String[] args) {
		int n = 3;
	//	int memo[] = new int[n + 1];
		Map<Integer, Integer> memo = new HashMap<>();
	//	System.out.println(recursion(0, n, memo));
		System.out.println(recursion2(n, memo));
		
		System.out.println(tabulation(n));
		

	}

	private static int tabulation(int n) {
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <=n ; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}

	//since it said count all possible ways, do the sum as per the recursion logic.
	private static int recursion(int i,int n, Map<Integer,Integer> memo) {
		
		if( i > n)
			return 0;
		if(i == n)
			return 1;
		
		if(memo.containsKey(i))
			return memo.get(i);
			
		int left = recursion(i+1,n,memo);
		int right = recursion(i+2,n,memo);
		
		memo.put(i, left + right);
		
		return memo.get(i);
		
	}
	
	private static int recursion2(int n, Map<Integer,Integer> memo) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;

		if(memo.containsKey(n))
			return memo.get(n);
		
		int left = recursion2( n-1, memo);
		int right = recursion2( n-2, memo);
		
		memo.put(n,  left+right);
		
		return memo.get(n);
		
	}
	

}
