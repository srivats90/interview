package Recursion;

public class PowerOfN {

	public static void main(String[] args) {
		
		int x = 2, y = 3;
		
		System.out.println(power(x,y));

	}

	private static int power(int x, int y) {
		
		int temp = 0;
		
		if(y == 0)
			return 1;
		
		temp = power(x ,y/2);
		
		if(y%2 == 0)
			return temp*temp;
		else 
			return x*temp*temp;
		
		
	}

}
