package prac;

public class Palin {

	public static void main(String[] args) {
		
		int x = 121;
		
		int rev = 0;
		int rem = 0;
		
		int y = x;
		while(x != 0) {
			rem = x%10;
			rev = rev*10 + rem;
			x = x/10;
		}
		
		System.out.println(rev);

	}

}
