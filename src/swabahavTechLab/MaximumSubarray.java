package swabahavTechLab;

public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentMaxSum = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
		    currentMaxSum =  Math.max(nums[i], currentMaxSum + nums[i]);
			maxSum = Math.max(maxSum, currentMaxSum);
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		
		 MaximumSubarray solution = new MaximumSubarray();
	        
	        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        System.out.println("Maximum subarray sum for nums1: " + solution.maxSubArray(nums1)); // Output: 6
	        
	        int[] nums2 = {1};
	        System.out.println("Maximum subarray sum for nums2: " + solution.maxSubArray(nums2)); // Output: 1
	        
	        int[] nums3 = {5, 4, -1, 7, 8};
	        System.out.println("Maximum subarray sum for nums3: " + solution.maxSubArray(nums3)); // Output: 23
	        
	        int[] nums4 = {-1, -2, -3, -4};
	        System.out.println("Maximum subarray sum for nums4: " + solution.maxSubArray(nums4)); // Output: -1
		
	}
}
