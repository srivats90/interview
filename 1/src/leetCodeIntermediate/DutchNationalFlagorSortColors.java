package leetCodeIntermediate;

public class DutchNationalFlagorSortColors {

	public static int[] sortColors(int[] arr) {
		
		
		//Logic : 0 < low < 1 < high < 2
		
		int left = 0; int right = arr.length - 1;
	    int i = 0;
		while( i <= right ) {
			if(arr[i] == 0) {
				swap(arr, i, left);
				i++;
				left++;			
			} else if(arr[i] == 1) {
				i++;
			} else {
				swap(arr, i , right);
				right--;
			}
		}

		return arr;
	}
	
	public static void swap(int[] arr, int i, int j){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static void main(String[] args) {
		
		int[] out = sortColors(new int[] {2,0,2,1,1,0});
		
		for(int i : out) {
			System.out.println(i);
		}

	}

}
