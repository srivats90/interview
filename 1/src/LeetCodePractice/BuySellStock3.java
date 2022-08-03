package LeetCodePractice;

public class BuySellStock3 {

	public static void main(String[] args) {
		
		bs(new int[] {3,3,5,0,0,3,1,4});

	}

	//atmost 2 transactions is the key.
	private static void bs(int[] is) {
		
		int minPrice1 = Integer.MAX_VALUE;
		int maxProfit1 = 0;
		
		int minPrice2 = Integer.MAX_VALUE;
		int maxProfit2 = 0;
		
		for(int cost : is) {
			minPrice1 = Math.min(minPrice1, cost);
			maxProfit1 = Math.max(maxProfit1, cost - minPrice1);
			
			minPrice2 = Math.min(minPrice2, cost - maxProfit1);
			maxProfit2 = Math.max(maxProfit2, cost - minPrice2);
		}
		
		System.out.println(maxProfit2);
	}

}
