package random;

public class PalinInt {

	public static void main(String[] args) {
		int temp = 12321;
		int m = 0;
	    while (temp > 0) {
	        m = temp % 10 + m * 10;
	        temp /= 10;
	    }
	    
	    System.out.println(m);
	}

}
