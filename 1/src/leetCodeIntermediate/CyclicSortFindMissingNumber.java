package leetCodeIntermediate;

public class CyclicSortFindMissingNumber {

	public static void main(String[] args) {
		
		findMiss(new int[] {4, 0, 3, 1});

	}

	private static void findMiss(int[] arr) {
		
		int i=0;
		while(i < arr.length) {
			if( arr[i] < arr.length && arr[i] != arr[arr[i]])
				swap(arr, i, arr[i]);
			else
				i++;
		}
		
		for(int j=0; j < arr.length ; j++) {
			if(j != arr[j])
				System.out.println(j);
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
