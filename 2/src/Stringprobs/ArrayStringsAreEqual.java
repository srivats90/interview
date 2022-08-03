package Stringprobs;

//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.

public class ArrayStringsAreEqual {

	public static boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {
		
		StringBuilder sb1 = new StringBuilder();
		for(String arr : arr1) {
			sb1.append(arr);
		}
		StringBuilder sb2 = new StringBuilder();
		for(String arr : arr2) {
			sb2.append(arr);
		}
		
//		if(sb1.compareTo(sb2) == 0)
//			return true;
		if(sb1.toString().equals(sb2.toString()))
			return true;
		
		return false;
		
//	    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//	        return String.join("", word1).equals(String.join("", word2));
//	    }
//		
	}
	public static void main(String[] args) {
		System.out.println(ArrayStringsAreEqual.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));

	}

}
