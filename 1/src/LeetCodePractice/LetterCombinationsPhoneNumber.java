package LeetCodePractice;
import java.util.*;

public class LetterCombinationsPhoneNumber {

	public static void main(String[] args) {
		
		Map<Integer,List<String>> map = new HashMap<>();
		map.put(2, new ArrayList<>(List.of("a","b","c")));
		map.put(3, new ArrayList<>(List.of("d","e","f")));
		map.put(4, new ArrayList<>(List.of("g","h","i")));
		
		String digits = "23";
		List<List<String>> list = new ArrayList<>();
		
		Stack<Character> stack = new Stack<>();
		
		System.out.println(list.toString());
	}

}
