package LeetCodePractice;

public class CountAndSay {

	public static void main(String[] args) {
		
		String s = "1";
		int n = 7;
		for(int i=1; i<n; i++) {
			
			StringBuilder sb = new StringBuilder();
			//because already 1 is present in s
			int count = 1;
			char c = s.charAt(0);
			//11
			for(int j=1; j<s.length(); j++) {
				if(s.charAt(j)!=c) {
					sb.append(count).append(c);
					count = 0;
					c=s.charAt(j);
				}
				count++;
			}
			
			sb.append(count).append(c);
			s = sb.toString();
			System.out.println(s);
		}
		
		

	}

}
