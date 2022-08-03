package frequentlyasked;

import java.util.*;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		// -4 -1 -1 0 1 2
//		int left = 0;
//		int right = nums.length - 1;
//		while(left <= right) {
//		//	Map<Integer,Integer> map = new HashMap<>();			
//			for(int i = left+1; i < right ; i++) {
//				List<Integer> list = new ArrayList<>();
//				if(nums[left] + nums[right] + nums[i] == 0) {
//					list.add(nums[left]);
//					list.add(nums[right]);
//					list.add(nums[i]);
//				}
//				if(list != null && !list.isEmpty())
//					result.add(list);				
//			}
//			left++;
//		//	right--;
//		}
		// -4 -1 -1 0 1 2
	    for (int i = 0; i < nums.length - 3; i++) {
	        if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
	            continue;
	        }
	        int left = i + 1, right = nums.length - 1;  
	        int target = -nums[i];
	        while (left < right) {
	            if (nums[left] + nums[right] == target) {
	                res.add(Arrays.asList(nums[i], nums[left], nums[right]));
	                left++;
	                right--;
	      //          while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
	      //          while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
	            } else if (nums[left] + nums[right] > target) {
	                right--;
	            } else {
	                left++;
	            }
	        }
	    }

		return res;
	}

	public static void main(String[] args) {
		List<List<Integer>> a = ThreeSum.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });

		for (List<Integer> i : a)
			for (int j : i)
				System.out.println(j);

		// System.out.println(0 - ( -4 + 2));
	}

}
