package Stringprobs;

//Input: s = "10#11#12"
//Output: "jkab"
//Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
import java.util.*;
public class AlphabetMapper {

	public static String alphabet(String input) {
		
		Map<String, String> map = new HashMap<String, String>()
		{{
		     put("10#", "j");
		     put("11#", "k");
		     put("12#", "l");
		     put("13#", "m");
		}};
		
		Map<Character, String> map2 = new HashMap<Character, String>()
		{{
		     put('1', "a");
		     put('2', "b");
		     put('3', "c");
		     put('4', "d");
		}};
		
		int i=0;
		String sb = new String(input);
		while(i < input.length()) {
			if( input.charAt(i) == '#') {
				System.out.println(input.substring(i-2, i+1));
				sb = sb.replace(input.substring(i-2, i+1), map.get(input.substring(i-2, i+1)));
			} 	
			i++;
		}
		for(int j=0; j<sb.length() ; j++) {
			if( map2.containsKey(sb.charAt(j))) {
				sb = sb.replaceAll(String.valueOf(sb.charAt(j)), map2.get(sb.charAt(j)));
			}
		}
		return sb.toString();
	}
	
//    StringBuilder sb = new StringBuilder();
//    int i = str.length() - 1;
//    while (i >= 0) {
//        if (str.charAt(i) == '#') {
//            sb.append(map.get(str.substring(i - 2, i+1)));
//            i -= 3;
//        } else {
//            sb.append(map.get(str.substring(i, i + 1)));
//            i--;
//        }
//    }
	
	public static void main(String[] args) {

		System.out.println(AlphabetMapper.alphabet("10#11#12"));
	}

}
