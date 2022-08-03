package Stringprobs;

public class Substr {

	public static void main(String[] args) {
		
		System.out.println(subStr("abcescde", "cd"));

	}

	private static boolean subStr(String str1, String str2) {
		// TODO Auto-generated method stub
		
		int start = 0, end = 0;
		
		int count = 0;
		
		while(end < str1.length()) {
			if(str1.charAt(end) == str2.charAt(count)) {
				if(count == 0)
					start = end;
				end++;
				count++;
				
				if(end - start  == str2.length())
					return true;
				
			} else {
				end++;
				count = 0;
			}
		}
		
		return false;
	}

}
