package Stringprobs;

public class ReplaceDigits {

	public static String replace(String input) {

		char[] c = input.toCharArray();

		for (int i = 0; i < c.length - 1; i += 2) {
			int ascii = Integer.parseInt(Character.toString(c[i + 1]));
			c[i + 1] = (char) (c[i] + ascii);
		}
		
//        for (int i = 1; i < charArr.length; i += 2) {
//            charArr[i] = (char)(charArr[i - 1] + charArr[i] - '0');
//        }

		return new String(c);
	}

	public static void main(String[] args) {

		System.out.println(ReplaceDigits.replace("a1b2c3d4"));
	}

}
