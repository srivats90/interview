package Stringprobs;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String input) {
		
		String[] tokens = input.split(" ");
		
		return tokens[tokens.length -1].length();
	}
	public static void main(String[] args) {
		System.out.println(LengthOfLastWord.lengthOfLastWord("Hello Worldddd"));
		System.out.println(LengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));

		// TODO Auto-generated method stub

	}

}
