package Stringprobs;

public class LengthLast {

	public static int lastLength(String input) {
		int len = 0;
		
		String[] tokens = input.split(" ");
		len = tokens[tokens.length -1].length();
		
		return len;
	}
	public static void main(String[] args) {
		
		System.out.println(LengthLast.lastLength("My name is Krishnakumar"));

	}

}
