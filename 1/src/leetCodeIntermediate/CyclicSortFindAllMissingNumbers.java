package leetCodeIntermediate;

public class CyclicSortFindAllMissingNumbers {

	public static void main(String[] args) {
		findAll(new int[] { 2, 3, 1, 8, 2, 3, 5, 1 });

	}

	private static void findAll(int[] nums) {

		int i = 0;
		while (i < nums.length) {
			if (nums[i] <= nums.length && nums[i] != nums[nums[i] -1])
				swap(nums, i, nums[i] - 1);
			else
				i++;
		}
		for(int j = 0 ; j < nums.length ; j++) {
			if(nums[j] != j+1) {
				System.out.println(j+1);
			}
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

}
