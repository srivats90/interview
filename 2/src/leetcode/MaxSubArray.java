package leetcode;

public class MaxSubArray {

	public static int maxSubArray(int[] input) {
		
		int i=0; int j =i; int ans = 0;
		for(i = 0; i < input.length ; i++) {
			int sum = 0;
			for(j = i; j < input.length ; j++) {
				sum += input[j];
				ans = Math.max(ans, sum);
			}
		}
		
		return ans;
	}
	
//	public static int maxSubArray(int[] A) {
//	    int maxSoFar=A[0], maxEndingHere=A[0];
//	    for (int i=1;i<A.length;++i){
//	    	maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
//	    	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
//	    }
//	    return maxSoFar;
//	}
	
	public static void main(String[] args) {

		System.out.println(MaxSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		System.out.println(MaxSubArray.maxSubArray(new int[] {5,4,-1,7,8}));

	}

}
