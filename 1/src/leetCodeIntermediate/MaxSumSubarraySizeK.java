package leetCodeIntermediate;

public class MaxSumSubarraySizeK {

	public static void main(String[] args) {
		maxSubArr(new int[] {100, 200, 300, 400} , 2);

	}

	private static void maxSubArr(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		for(int end = 0; end < arr.length ; end++) {
			currentSum += arr[end];
			
			if(end - start + 1 >= target) {
				maxSum = Math.max(maxSum, currentSum);
				currentSum -= arr[start];
				start++;
			}
		}
		
		System.out.println(maxSum);
	}

}
