package DynamicProgramming;

public class BuyAndSellStocks {

	public static void main(String[] args) {
		
		stock(new int[] {7,6,4,3,1});

	}

	private static void stock(int[] arr) {
		
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length ; i++) {
			buyPrice = Math.min(buyPrice, arr[i]);
			maxProfit = Math.max(maxProfit, arr[i] - buyPrice);
		}
		
		System.out.println(maxProfit);
		
	}

}
