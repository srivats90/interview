package leetCodeIntermediate;

//Given an array nums with n integers, your task is to check if it could become non-decreasing by modifying at most one element.

public class NondecreasingArray {

	public static boolean increaseArray(int a[]) {
		int[] out = new int[a.length];
		
		int mid = a.length/2;
		int left = mid-1;
		int right = mid+1;
		int temp = mid;
		boolean flag = false;
		while(right != a.length) {
			if(a[left] <= a[temp]) {
				left--;
				temp--;
			} else {
				if(flag == false) {
					flag = true;
					a[left] = a[temp] - 1;
				} else {
					return false;
				}
				
			}
				
			if(a[right] >= a [mid]) {
				right ++;
				mid++;
			} else {
				if(flag == false) {
					flag = true;
					a[left] = a[temp] - 1;
				}else {
					return false;
				}
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println(increaseArray(new int[] { 4,2,1}));

	}

}
