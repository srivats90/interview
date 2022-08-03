package leetCodeIntermediate;

public class CyclicSortFindDupMiss {

	public static void main(String[] args) {

		findMulMis(new int[] { 3, 1, 2, 3, 6, 4 });

	}

	private static void findMulMis(int[] nums) {

		int i = 0;

		while (i < nums.length) {
			if (nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
				swap(nums, i, nums[i] - 1);
			} else
				i++;
		}
		for (int j : nums) {
			System.out.println(j);
		}

		for (int k = 0; k < nums.length; k++) {
			if (nums[k] != k + 1) {
				System.out.println("Miss " + Integer.sum(k, 1));
				System.out.println("Dupc " + nums[k]);
			}
		}

	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

}
