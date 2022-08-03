package leetcode;

import java.util.Arrays;

public class MergeArray {
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		
		int[] out = new int[m+n];
		int i = 0;
		for( i=0; i<m ; i++) {
			out[i] = nums1[i];
		}
		for(int j=0; j<n ; j++) {
			out[i++] = nums2[j];
		}
		Arrays.sort(out);
		return out;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int out[] = MergeArray.merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
	//	int out[] = MergeArray.merge(new int[] {1}, 1, new int[] {}, 3);

		for(int i : out) {
			System.out.println(i);
		}

	}

}
