package Stringprobs;

//Input: s = "is2 sentence4 This1 a3"
//Output: "This is a sentence"
//Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", 
//then remove the numbers.
import java.util.*;

public class SortSentence {
	
	public static String sortSentence(String input) {
		String[] tokens = input.split(" ");
		Map<Integer, String> map = new HashMap<>();
		StringBuilder result = new StringBuilder();
		for(String token : tokens) {
			String k = Character.toString(token.charAt(token.length()-1));
			map.put(Integer.parseInt(k), token.substring(0, token.length() -1));
		}
		for(int i=1; i<=tokens.length; i++) {
			result.append(map.get(i) + " ");
		}
		
		return result.toString().substring(0, result.toString().length()-1);
	}

//	String[] str = s.split(" ");                // Since the String contains only whitespaces, it's safe to split the String at them
//	String[] res = new String[str.length];      // This String array will hold the rearranged words
//	StringBuilder sb = new StringBuilder();     // Instead of using '+' operator to concat repeatedly, I have created a StringBuilder object which is more efficient
//	int i = 0;                          
//	for (String elem : str) {
//		i = (int) (elem.charAt(elem.length() - 1) - '0');  // This  will extract the digit present at the end of each String and store it in i (i = index of the word in res[])
//		res[i - 1] = elem.substring(0, elem.length() - 1); // This gives the substring of each String except for the digit in the end and stores the word at an appropriate index (i - 1) in res[]
//	}
//	//append the words from res[] to StringBuilder object to form a sentence
//	for (i = 0; i < res.length - 1; i++)
//		sb.append(res[i]).append(" ");
//	sb.append(res[i]);
//	return sb.toString();
	
//    public String sortSentence(String s) {
//        String[] words = s.split(" ");
//        String[] bucket = new String[words.length];
//        for (String word : words) {
//            // Get 0th-based index from the word
//            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
//            // Store the original word without a numeric value
//            bucket[index] = word.substring(0, word.length() - 1);
//        }
//    return String.join(" ", bucket);

	
	public static void main(String[] args) {
		System.out.println(SortSentence.sortSentence("is2 sentence4 This1 a3"));
	}

}
