package LeetCodePractice;

public class Atoi {

	public static void main(String[] args) {
		
		String s = "-42";
		
		char[] cArr = s.toCharArray();
		int res = 0;
		for(int i = 0 ; i < cArr.length ; i++) {
			if(Character.isDigit(cArr[i]))
				res = res*10 + cArr[i] - '0';
		}
		
		System.out.println(res);
	}

}
