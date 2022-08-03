package TwoPointers;

public class SortArrSum {

	public static void main(String[] args) {
		
		int[] arr = arrSum(new int[] {1, 2, 3, 4, 6}, 6);
		
		for(int a : arr) {
			System.out.println(a);
		}

	}

	private static int[] arrSum(int[] arr, int target) {
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				return new int[] {left,right};
			} else if(sum > target) {
				right--;
			} else {
				left++;
			}
		}
		return new int[] {-1,-1};
		
	}

}
