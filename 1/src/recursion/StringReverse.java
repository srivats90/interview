package recursion;

public class StringReverse {

	public static void main(String[] args) {
		
		System.out.println(reverse("krish", ""));
	//	System.out.println("krish".substring(4, 5));
		
	}

	private static String reverse(String string, String string2) {
		
		if(string == null) {
			return string2;
		}
		int len = string.length();
		
		if(len > 1) {
		   string2 += string.substring(len-1, len);
		   string = string.substring(0, len-1);
		}
		else {
			string2 += string;
			string = null;
		}		
		
		return reverse(string, string2);
	}

}
