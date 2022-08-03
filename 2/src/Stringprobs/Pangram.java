package Stringprobs;

import java.util.*;

public class Pangram {

	public static boolean panagram(String sentence) {
		
		Set<Character> set = new TreeSet<>();
		
		for(int i=0; i < sentence.length(); i++) {
			set.add(sentence.charAt(i));
		}
		
		if(set.size() == 26)
			return true;
		
		return false;
	}
	public static void main(String[] args) {

		System.out.println(Pangram.panagram("thequickbrownfoxjumpsoverthelazydog"));
	}

}
