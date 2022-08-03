package leetCodeIntermediate;

public class SquareSortedArray {

	public static int[] square(int[] arr) {
		
		int[] out = new int[arr.length];
		
		//keep comparing ends which is left or right bcause sq of smallest negative can be largest..
		
		int left = 0; int right = arr.length - 1;
		int i = arr.length - 1;
		while(i >= 0) {
			int leftSq = arr[left] * arr[left];
			int rightSq = arr[right] * arr[right];
			if(leftSq > rightSq) {
				out[i] = leftSq;
				left++;
			} else {
				out[i] = rightSq;
				right--;
			}
			i--;
		}
		
		return out;
	}
	public static void main(String[] args) {
		
		int[] out = square(new int[] {-2,-1,0,1,2});
		
		for(int i : out) {
			System.out.println(i);
		}

	}

}
