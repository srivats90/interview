package LeetCodePractice;

public class BuySellStock2 {

	public static void main(String[] args) {
		
		bs(new int[] {7,1,5,3,6,4});

	}

	private static void bs(int[] arr) {
		
		int maxProfit = 0;
		
		for(int i = 1; i < arr.length ; i++) {
			if(arr[i] > arr[i-1]) {
				maxProfit +=  arr[i] - arr[i-1];
			}
		}
		
		System.out.println(maxProfit);
		
	}

}
