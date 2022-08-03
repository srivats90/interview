package leetCodeIntermediate;

public class ShortestUnsortedContiguousSubArray {

	public static int subArray(int[] arr) {
		
		int low = 0;
		int high = arr.length -1;
		
		//find the start where subarray is not sorted
		while(low < high -1 && arr[low] < arr[low+1]) {
			low++;
		}
		
		//find the end where subarray is not sorted
		while(high > 0 && arr[high] > arr[high-1])
			high--;
		
		//Now try to find the min n max of this subarray
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=low; i<high; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		//do this to expand the low to check if any value other than the subarray has value greater than min of the subarray
		while(low > 0 && arr[low - 1] > min)
			low--;
		
		while(high < arr.length -1 && arr[high+1] < max)
			high++;
		
		return high-low+1;
	}
	
	public static void main(String[] args) {
		
		int res = subArray(new int[] {1,3,2,0,-1,7,10});
		System.out.println(res);
	}	

}
