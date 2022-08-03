package LeetCodePractice;

public class BackSpaceStringCompare {

	public static void main(String[] args) {
		
		System.out.println(backspaceComp("ab#c", "b"));

	}

	private static boolean backspaceComp(String s, String t) {
		
		//THINK OF STACK BASED SOLUTION
		while(s.contains("#")) {
			int pos = s.indexOf('#');
			if(pos < s.length()) {
				String temp = s.substring(0,pos-1) + s.substring(pos+1);
				s = temp;
			} else 
				s = s.substring(0,pos-1);
			System.out.println(s);
		}
		
		while(t.contains("#")) {
			int pos = t.indexOf('#');
			if(pos < t.length()) {
				String temp = t.substring(0,pos-1) + t.substring(pos+1);
				t = temp;
			} else 
				t = t.substring(0,pos-1);
			System.out.println(t);
		}
		
		if(s.equals(t))
			return true;
		return false;
	}

}
