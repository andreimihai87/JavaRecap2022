package amd.leetcode.twosums;

public class Solution {
	
	public int[] twoSum(int[] nums, int target) {

		int[] indices = new int[2];
		int sum = 0;
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			sum = nums[i];
			for (int j = i + 1; j < length; j++) {
				if (sum + nums[j] == target) {
					indices[0] = i;
					indices[1] = j;
					return indices;
				}
			}
		}
		return indices;
	}

}
