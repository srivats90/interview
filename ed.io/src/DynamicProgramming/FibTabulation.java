package DynamicProgramming;

public class FibTabulation {

	public static void main(String[] args) {
		
		int n = 7;
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[n]);
		//Space optmization
		int prev2 = 0;
		int prev = 1;
		int curr = 0;
		for(int i = 2; i <=n ; i++) {
			curr = prev + prev2;
			prev2 = prev;
			prev = curr;
		}

		System.out.println(prev);
	}

}
