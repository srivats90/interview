package prac;

public class TEst {

	public static void main(String[] args) {
		String a = "how are you, abc";
		
		String[] tokens = a.split(",");
		tokens[1] = tokens[1].replace(" ", "");
		
		for(char c : tokens[1].toCharArray()) {
			String temp = String.valueOf(c);
			if(tokens[0].contains(temp)) {
				tokens[0] = tokens[0].replaceAll(temp, "");
			}
		}
		
		for(String b : tokens) {
			System.out.println(b);
		}

	}

}
