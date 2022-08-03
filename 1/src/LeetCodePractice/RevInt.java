package LeetCodePractice;

public class RevInt {

	public static void main(String[] args) {
		
		
		int x = -120;
		
		int div = Math.abs(x);
		int rem = 0;
		int rev = 0;
		while(div > 0) {
			rem = div % 10;
			div = div/10;
			
			rev = rev*10 + rem;
		}
		if(x < 0)
			System.out.println(-rev);

	}

}
