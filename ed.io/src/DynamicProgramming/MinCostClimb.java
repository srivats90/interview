package DynamicProgramming;

import java.util.*;
public class MinCostClimb {

	public static void main(String[] args) {
		
		int[] cost = {10,15,20};
		
		tabulation(cost);
		
		Map<Integer,Integer> memo = new HashMap<>();
		
		System.out.println(recursion(cost.length, cost, memo));

	}

	private static int recursion(int i, int[] cost, Map<Integer, Integer> memo) {
		
		if(i <= 1)
			return 0;
		
		if(memo.containsKey(i))
			return memo.get(i);
			
		int leftCost = cost[i-1] + recursion(i-1, cost, memo);
		int rightCost = cost[i-2] + recursion(i-2, cost, memo);
		
		memo.put(i, Math.min(leftCost, rightCost));
		
		return memo.get(i);
		
	}

	private static void tabulation(int[] cost) {
		
		int[] dp = new int[cost.length+1];
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = 0;
		
		for(int i = 3; i <= cost.length ; i++) {
			dp[i] = Math.min(cost[i-1] + dp[i-1], cost[i-2] + dp[i-2]); 
		}
		
		System.out.println(dp[cost.length]);
		
	}

}
