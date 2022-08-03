package Stringprobs;

public class Palin {

	public static void main(String[] args) {
		
		String a = "krish";
		
		char[] arr = a.toCharArray();
		
		String rev = "";
		
		for(int i = arr.length - 1; i >= 0; i--) {
			rev += arr[i];
		}
		
		if(a.equals(rev))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
