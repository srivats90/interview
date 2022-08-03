package LeetCodePractice;

public class BuySellStock1 {

	public static void main(String[] args) {
		
		bs(new int[] {7,6,4,3,1});

	}

	public static void bs (int[] arr) {
		
//		int maxSum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i+1 ; j < arr.length ; j++) {
//				int temp =  arr[j] - arr[i];
//				maxSum = Math.max(maxSum, temp);
//			}
//		}
		
//		System.out.println(maxSum);
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i = 0; i < arr.length; i++) {
			minPrice = Math.min(minPrice, arr[i]);
			maxProfit = Math.max(maxProfit, arr[i] - minPrice);
		}
		
		System.out.println(maxProfit);
	}

}
