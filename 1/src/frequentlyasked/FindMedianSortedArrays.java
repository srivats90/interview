package frequentlyasked;

import java.util.Arrays;

public class FindMedianSortedArrays {
	
	public static double findMedianSortedArrays(int[] a, int[] b) {


		int x = a.length;
		int y = b.length;
		
		if(x > y)
			findMedianSortedArrays(b, a);
		
		int low = 0;
		int high = x;
		
		
		while(low <= high) {
			int partitionX = (low + high)/2;
			int partitionY = (x+y+1)/2 - partitionX;
			
			int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : a[partitionX - 1];
			int minRightX = (partitionX == x) ? Integer.MAX_VALUE : a[partitionX];
			
			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : b[partitionY - 1];
			int minRightY = (partitionY == y) ? Integer.MAX_VALUE : b[partitionY];
			
			if(maxLeftX <= minRightY  && maxLeftY <= minRightX) {
				if((x+y)%2 == 0)
					return (double)(Math.max(maxLeftX,maxLeftY ) + Math.min(minRightX, minRightY))/2.0;
				else
					return (double)(Math.max(maxLeftX, maxLeftY))/1.0;
				
			} else if( maxLeftX > minRightY)
				high = partitionX - 1;
			else
				low = partitionX + 1;
			
		}
		throw new IllegalArgumentException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FindMedianSortedArrays.findMedianSortedArrays(new int[] {1,2}, new int[] {3,4}));
		System.out.println(FindMedianSortedArrays.findMedianSortedArrays(new int[] {1,3}, new int[] {2}));


	}
	//https://www.youtube.com/watch?v=LPFhl65R7ww

}
