package Random;
import java.util.*;

public class NextGreater {

	public static void main(String[] args) {
		
		nextGreater(new int[] {13, 7, 6, 12});

	}

	private static void nextGreater(int[] arr) {
		
		int[] newArr = new int[arr.length];
		
//		for(int i= 0; i < arr.length; i++) {
//			int temp = arr[i];
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[j] > temp) {
//					temp = arr[j];
//					break;
//				}
//			}
//			if(temp == arr[i])
//				newArr[i] = -1;
//			else
//				newArr[i] = temp;
//		}
//		
//		for(int k : newArr)
//			System.out.println(k);
		
		Stack<Integer> st = new Stack<>();
		// 1 3 2 4 5
		for(int i = 0; i < arr.length; i++) {
			if(!st.isEmpty()) {
				if(st.peek() < arr[i]) {
				//	newArr[]
				}
			}else
				st.push(arr[i]);
		}
		
	}

}
