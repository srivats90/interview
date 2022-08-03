package frequentlyasked;

public class MaxArea {

	public static int maxArea(int[] height) {
		
//		int left = 0;
		int area = 0;
//		int right = height.length - 1;
//		while(left <= right) {
//			area = Math.max(area, Math.min(height[left],height[right]) * (right - left));
//		}
		
		for(int i=0 ; i < height.length ; i++) {
			for(int j=i+1; j<height.length; j++) {
				area = Math.max(area, Math.min(height[i], height[j]) * (j-i) );
			}
		}
		
		return area;
	}
	public static void main(String[] args) {
		
		System.out.println(MaxArea.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
		// TODO Auto-generated method stub

	}

}
