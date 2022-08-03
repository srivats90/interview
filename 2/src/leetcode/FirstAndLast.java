package leetcode;

public class FirstAndLast {

	public static void main(String[] args) {
		
		int[] arr = { 1, 1, 3, 3, 3,5,7,7};
		
		int target = 7;
		int firstPos = -1;
		int lastPos = 0;
		
		for(int i=0; i < arr.length ; i++) {
			if(arr[i] == target) {
				if(firstPos == -1) {
					firstPos = i;
				}
				lastPos = i;
			}
		}
		
		System.out.println(firstPos +" " + lastPos);

	}

}
