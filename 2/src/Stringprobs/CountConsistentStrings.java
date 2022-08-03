package Stringprobs;

public class CountConsistentStrings {

	public static int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		boolean flag = true;
		for(String word : words) {
			for(int i=0; i< word.length(); i++) {
				if(!allowed.contains(Character.toString(word.charAt(i)))) {	
					flag = false;
					break;
				}else
					flag = true;
			}	
			if(flag == true)
			    count++;
		}
		
		return count;
	}
	public static void main(String[] args) {
		System.out.println(CountConsistentStrings.countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"}));
		System.out.println(CountConsistentStrings.countConsistentStrings("abc", new String[] {"a","b","c","ab","ac","bc","abc"}));

		//	System.out.print("abc".contains("a"));

	}

}
