package leetCodeIntermediate;

public class MinumumSizeSubArraySum {

	public static void minimum(int[] arr, int target) {
		
		int minLen = Integer.MAX_VALUE;
		int sum = 0;
		int windowStart = 0;
		for(int i=0 ; i< arr.length ;i++) {
			sum += arr[i];
			while(sum >= target) {
				minLen =     Math.min(i - windowStart +1 , minLen);		
				sum = sum - arr[windowStart];
				windowStart += 1;
				
//				if(sum == target) {
//					minLen =     Math.min(i - windowStart , minLen);
//				} 
			}
		}
		
		System.out.println(minLen);
		
	}
	
	public static void main(String[] args) {
		
		minimum(new int[] {2,3,1,2,4,3}, 7);

	}

}
