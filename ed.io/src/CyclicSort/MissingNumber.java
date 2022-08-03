package CyclicSort;

public class MissingNumber {

	public static void main(String[] args) {
		
		missNum(new int[] {6, 4, 3, 5, 5, 1 });

	}

	private static void missNum(int[] arr) {
		
		int i = 0;
		int j = 0;
		while(i < arr.length) {
			j = Math.abs(arr[i] - 1);
			if(i>0 && arr[i] != arr[j] ) {
				swap(arr, i, j);
			} else 
				i++;
		}
		
		for(int k=0 ; k < arr.length ; k++) {
			if(k+1 != arr[k])
				System.out.println(k+1);
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
