package CyclicSort;

public class InPlaceSort {

	public static void main(String[] args) {
		
		sort(new int[] {3,1,5,4,2});

	}

	private static void sort(int[] arr) {
		
		int i = 0;
		
		while(i < arr.length ) {
			if(i > 0 && arr[i] != arr[arr[i] -1]) {
				swap(arr, i, arr[i] - 1);
			} else 
				i++;
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
