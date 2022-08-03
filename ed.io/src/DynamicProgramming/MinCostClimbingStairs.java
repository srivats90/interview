package DynamicProgramming;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		
		climb(new int[] {10,15,20});

	}

	private static void climb(int[] nums) {
		
		int[] dp = new int[nums.length +1];
		
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = 0;
		
		for(int i = 2; i< nums.length ; i++) {
			int step1 = dp[i] + nums[i];
			int step2 = dp[i-1] + nums[i-1];
			dp[i+1] = Math.min(step1, step2);
		}
		
		System.out.println(dp[nums.length]);
		
	}

}
