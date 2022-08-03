package DynamicProgramming;

public class HouseRobber {

	public static void main(String[] args) {
		
		rob(new int[] {1,2,3,1});

	}

	private static void rob(int[] arr) {
		
		//Below are dp's template code. Length+1 because to consider dp[0] case
		int[] dp = new int[arr.length+1];
		
		dp[0] = 0; //indicating you have not robbed any house
		dp[1] = arr[0]; //indicating that you have robbed first house
		
		//starts at 1 because arr[0] is already handled.
		for(int i = 1; i< arr.length ; i++) {
			dp[i+1] = Math.max(dp[i], dp[i-1] + arr[i]); //Its either previous max.. or prev to prev + current.
		}
		
		System.out.println(dp[arr.length]);
		
		
		
	}

}
