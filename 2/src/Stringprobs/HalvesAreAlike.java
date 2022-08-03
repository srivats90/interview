package Stringprobs;

public class HalvesAreAlike {

	public static boolean halvesAreAlike(String input) {
		
		String vowels = "aeiouAEIOU";
		int right = input.length() - 1;
		int left = 0;
		char[] c = input.toCharArray();
		int leftCount = 0;
		int rightCount = 0;
		
		for(int i=0; i < (input.length()/2) ; i++) {
			if(vowels.contains(Character.toString(c[left])))
				leftCount++;
			if(vowels.contains(Character.toString(c[right])))
				rightCount++;
			left++; right--;
		}
		if(leftCount == rightCount)
			return true;
		
		return false;
	}
	public static void main(String[] args) {
		System.out.println(HalvesAreAlike.halvesAreAlike("boOk"));

	}

}
