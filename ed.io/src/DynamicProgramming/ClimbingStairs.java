package DynamicProgramming;

public class ClimbingStairs {

	public static void main(String[] args) {
		
		climb(4);

	}

	private static void climb(int n) {
		
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 2 ; i < n ; i++) {
			dp[i+1] = dp[i] + dp[i-1];
		}
		
		System.out.println(dp[n]);
		
	}

}
