package prac;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		System.out.println(prefix(new String[]{"flower","flow","flight"}));

	}

	private static String prefix(String[] arr) {
		
		for(int i = 0; i < arr[0].length() ; i++) {
			char c = arr[0].charAt(i);
			for(int j = 1; j < arr.length ; j++) {
				if(i > arr[j].length() || c != arr[j].charAt(i)) {
					return arr[0].substring(0,i);
				}
			}
		}
		return null;
		
	}

}
