package leetCodeIntermediate;

public class RemoveDuplicates {

	public static int removeDupl(int[] arr) {
		
		int nonDup = 1;
		
		for(int i=1; i< arr.length ; i++) {
			if(arr[nonDup-1] != arr[i]) {
				arr[nonDup] = arr[i];
				nonDup++;
			}
		}
		for(int i : arr)
		    System.out.println(i);
		return nonDup;
	}
	public static void main(String[] args) {
		
		int index = removeDupl(new int[] {0,0,1,2,2,2,3,4,4,5});
		System.out.println(index);

	}

}
