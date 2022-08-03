package DynamicProgramming;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		
		
		maxSum(new int[] {-2,1,-3,4,-1,2,1,-5,4});

	}

	private static void maxSum(int[] arr) {
		
		int maxEndingHere = arr[0];
		int maxSofar = arr[0];
		
		for (int i = 1 ; i < arr.length ; i++) {
			maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i]);
			maxSofar = Math.max(maxSofar, maxEndingHere);
		}
		
		System.out.println(maxSofar);
	}

}
