package slidingwindow;

public class MaxSumSubArr {

	public static void main(String[] args) {
		
		maxSum(new int[] {2, 1, 5, 1, 3, 2}, 3);

	}

	private static void maxSum(int[] arr, int k) {

		int start=0;
		int maxsum = Integer.MIN_VALUE;
		int tempsum = 0;
		
		for(int end=0; end < arr.length; end++) {
			tempsum+= arr[end];
			
			if(end >= k-1) {
				maxsum = Math.max(maxsum, tempsum);
				tempsum -= arr[start];
				start++;
			}
		}
		
		System.out.println(maxsum);
	}

}
