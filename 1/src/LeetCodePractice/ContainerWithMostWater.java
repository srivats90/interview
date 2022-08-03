package LeetCodePractice;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		int[] height = {1,8,6,2,5,4,8,3,7};
		
		int left = 0;
		int right = height.length - 1;
		int sum = 0;
		while(left < right) {
			int dis = right - left;
			int temp = Math.min(height[right], height[left]) * dis;
			
			sum = Math.max(sum, temp);
			
			//KEY LOGIC IS HERE.
			if(height[left] < height[right]) {
				left++;
			} else
				right--;
		}
        
//        for(int i = 0; i < arr.length ; i++) {
//        	for(int j = i+1; j < arr.length ; j++) {
//        		  int dis = j - i;
//        		  int temp = Math.min(arr[i], arr[j]) * dis;
//        		  sum = Math.max(sum, temp);
//        	}
//        }
//        
       System.out.println(sum);

	}

}
