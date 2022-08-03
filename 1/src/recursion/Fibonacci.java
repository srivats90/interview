package recursion;

public class Fibonacci {

	public static long[] memoization;
	public static void main(String[] args) {
		
		int n = 92;
		
		memoization = new long[n+1];
		System.out.println(fibonacci(n));

	}

	private static long fibonacci(int n) {
		if(n <= 1) {
			return n;
		}
		if(memoization[n] != 0)
			return memoization[n];
		
		long memo = fibonacci(n-1) + fibonacci(n-2);
		memoization[n] = memo;
		return memo;
	}

}
