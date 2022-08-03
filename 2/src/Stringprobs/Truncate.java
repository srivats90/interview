package Stringprobs;

public class Truncate {

	public static String truncate(String input, int k) {

		String[] tokens = input.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < k; i++)
			sb.append(tokens[i] + " ");

		return sb.toString().substring(0, sb.toString().length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(Truncate.truncate("Hello how are you Contestant", 4));

	}

}
