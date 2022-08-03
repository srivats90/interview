package Stringprobs;

public class FirstPalindrome {

	public static String first(String[] arr) {

//		for (int i = 0; i < arr.length; i++) {
//			char[] c = arr[i].toCharArray();
//			int left = 0;
//			int right = c.length - 1;
//			for (int j = 0; j < c.length; j++) {
//				if (c[left] == c[right]) {
//					left++;
//					right--;
//					if(left == right || right - left == 1)
//						return new String(c);					
//				} else
//					break;
//			}
//		}
		
		for(String word : arr) {
			StringBuilder sb = new StringBuilder();
			sb.append(word);
			sb.reverse();
			if( sb.toString().equals(word))
				return word;
		}

		return null;
	}

	public static void main(String[] args) {
		System.out.println(FirstPalindrome.first(new String[] { "abc", "car", "ada", "racecar", "cool" }));

	}

}
