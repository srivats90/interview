package Recursion;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "krishna";
		StringBuilder sb = new StringBuilder();
		recurse(str.length()-1 , str, sb);
		
		System.out.println(sb.toString());

	}

	private static void recurse(int i, String str, StringBuilder sb) {
		
		if(i == 0) {
			sb.append(str.charAt(i));
			return ;
		}
		sb.append(str.charAt(i));
		recurse(i-1, str,sb);
		
	}

}
