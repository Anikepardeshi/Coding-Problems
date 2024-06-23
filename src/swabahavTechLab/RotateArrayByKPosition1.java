package swabahavTechLab;

import java.util.Arrays;

public class RotateArrayByKPosition1 {
	
	public void rotate(int[] nums, int k) {
		int n = nums.length;
        k = k % n;
        
        if (k == 0) {
            return; // No rotation needed if k is 0
        }
        
        int[] temp = new int[k];
        
        // Store the last k elements in temp array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        
        // Shift remaining elements to the right
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        
        // Copy elements from temp to beginning of nums
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
	}
	
	
	public static void main(String[] args) {
		
		RotateArrayByKPosition1 solution = new RotateArrayByKPosition1();
		
		int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        System.out.println("Array after rotation by " + k1 + " places: " + Arrays.toString(nums1));
        
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        solution.rotate(nums2, k2);
        System.out.println("Array after rotation by " + k2 + " places: " + Arrays.toString(nums2));
        
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7};
        int k3 = 10;
        solution.rotate(nums3, k3);
        System.out.println("Array after rotation by " + k3 + " places: " + Arrays.toString(nums3));
	}

}
