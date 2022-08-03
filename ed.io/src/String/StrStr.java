package String;

public class StrStr {

	public static void main(String[] args) {

		String str1 = "mississipi";
		String str2 = "issipi";

		for (int end = 0; end < str1.length(); end++) {
			int endIndex = end;
			int startIndex = 0;
			while (endIndex < str1.length() && startIndex < str2.length()
					&& str1.charAt(endIndex) == str2.charAt(startIndex)) {
				endIndex++;
				startIndex++;
			}

			if (startIndex == str2.length())
				System.out.println(true);

		}
		System.out.println(false);

	}

}
