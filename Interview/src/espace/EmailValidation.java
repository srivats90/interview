package espace;
import java.util.regex.*;

public class EmailValidation {

	public static void main(String[] args) {
		
	//	System.out.println(validateEmail("ckrishnakumar@ericss12on.com"));
		
	//	 Pattern p = Pattern.compile("^\\S+@\\S+$");
		 Pattern p = Pattern.compile("\\b\\S+@\\S+\\b"); //word boundary

		 Matcher m = p.matcher("c.krishnakumar@ericsson.com");
		// boolean b = m.matches();
		 
//		 if(m.find()) {
//			 System.out.println(m.group());
//		 }
	//	 System.out.println(b);
		 
		 while(m.find()) {    // while reading from file and incase multiple matches in each line.. 
			 System.out.println(m.group());
		 }

	}

	private static boolean validateEmail(String str) {
		
		if(str!=null) {
//			if(str.matches("[\\s]+"))
		//	if(str.matches("\\d"))
		//		return true;
			
		//	if(str.matches("^\\S+@{1}\\w+.\\w+$")) {
			if(str.matches("^\\s*\\S+@{1}\\w+.[\\w]{2,4}$")) {  // means 2 to 4
				return true;
			}
//				
//			else if(str.matches("[a-zA-Z0-9.@_]+")) {
////				if(str.matches("@{1}")) {
////					return true;
////				} else
////					return false;
//				char[] cArr = str.toCharArray();
//				int count = 0;
//				for(char c : cArr) {
//					if(c == '@') {
//						count++;
//					}
//				}
//				if(count > 1) {
//					return false;
//				} else
//					return true;
//			}
				
		}
		
		return false;
		
	}

}
