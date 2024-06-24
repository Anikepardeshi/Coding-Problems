package swabahavTechLab;

public class findMedianSortedArray {
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int m = nums1.length;
		int n = nums2.length;
		
		if(m > n) {
			return findMedianSortedArrays(nums2, nums1);
		}
		
		int left = 0, right = m;
        int partitionX, partitionY;
        int maxXLeft, minXRight, maxYLeft, minYRight;
        
        while(left <= right) {
        	partitionX = (left + right) / 2;
        	partitionY = (m + n + 1) / 2 - partitionX;
        	
        	maxXLeft = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            minXRight = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            
            maxYLeft = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            minYRight = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
            
            if (maxXLeft <= minYRight && maxYLeft <= minXRight) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxXLeft, maxYLeft) + Math.min(minXRight, minYRight)) / 2.0;
                } else {
                    return Math.max(maxXLeft, maxYLeft);
                }
            } else if (maxXLeft > minYRight) {
                right = partitionX - 1;
            } else {
                left = partitionX + 1;
            }
        }
        throw new IllegalArgumentException("Arrays are not sorted or not properly partitioned.");	
	}

	public static void main(String[] args) {
		
		findMedianSortedArray solution = new findMedianSortedArray();
		
		 // Test cases
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums1, nums2)); // Output: 2.0
        
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums3, nums4)); // Output: 2.5
        
        int[] nums5 = {0, 0};
        int[] nums6 = {0, 0};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums5, nums6)); // Output: 0.0
        
        int[] nums7 = {};
        int[] nums8 = {1};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums7, nums8)); // Output: 1.0
		
	}
}
