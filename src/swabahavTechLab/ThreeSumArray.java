package swabahavTechLab;

import java.util.*;

public class ThreeSumArray {

	// if we want to return elements in response then we have to sort input.
	// if we want to return index in response then we don't have to sort array.
	// remove duplicate using two pointer method
	// avoid fixed N1 duplicates

	public List<List<Integer>> result = new ArrayList<>();

	void twoSum(int[] nums, int target, int i, int j) {
		while (i < j) {
			if (nums[i] + nums[j] < target) {
				i++;
			} else if (nums[i] + nums[j] > target) {
				j--;
			} else {
				// Add the triplet to the result list
				List<Integer> triplet = new ArrayList<>();
				triplet.add(-target);
				triplet.add(nums[i]);
				triplet.add(nums[j]);
				result.add(triplet);

				// Skip duplicates
				while (i < j && nums[i] == nums[i + 1]) {
					i++;
				}
				while (i < j && nums[j] == nums[j - 1]) {
					j--;
				}

				i++;
				j--;
			}
		}
	}

	public List<List<Integer>> threeSum(int[] nums) {
		int n = nums.length;

		if (n < 3) {
			return new ArrayList<>();
		}

		result.clear();

		Arrays.sort(nums);// [-4,-1,-1,0,1,2]

		// Fix one element and find pairs that sum to the negative of that element
		for (int i = 0; i < n; i++) {
			// Skip duplicates
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			// n1 + n2 + n3 = 0 i.e n2 + n3 = -n1
			int n1 = nums[i];
			int target = -n1;

			twoSum(nums, target, i + 1, n - 1);
		}

		return result;
	}

	public static void main(String[] args) {
		ThreeSumArray solution = new ThreeSumArray();
		int[] nums1 = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result1 = solution.threeSum(nums1);
		System.out.println("Triplets for nums1: " + result1);

		int[] nums2 = { 1, 2 };
		List<List<Integer>> result2 = solution.threeSum(nums2);
		System.out.println("Triplets for nums2: " + result2);

		int[] nums3 = { 0, 0, 0 };
		List<List<Integer>> result3 = solution.threeSum(nums3);
		System.out.println("Triplets for nums3: " + result3);
	}
}
