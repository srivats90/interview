package leetcode;

import java.util.Arrays;

public class RemoveElement {

	public static int[] removeElement(int[] in , int key) {
		int[] out = new int[in.length];
		int k = 0;
		
		Arrays.sort(in);
		int count = 0;

		for(int i : in) {
			if(i != key) {
				out[k++] = i;
			} else
				count++;
		}
		
		int diff = out.length - count;
		int[] fin = new int[diff];
		
		for(int l=0; l< diff; l++) {
			fin[l] = out[l];
		}
		return fin;
	}
	public static void main(String[] args) {
		
		int[] out = RemoveElement.removeElement(new int[] {0,1,2,2,3,0,4,2} , 2);
		// TODO Auto-generated method stub
		for(int i : out) {
			System.out.println(i);
		}

	}

}
