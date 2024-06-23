package swabahavTechLab;

import java.util.Arrays;

public class RotateArrayByKPosition2 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Normalize k
        
        // Reverse the entire array
        reverse(nums, 0, n - 1);
        
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
    	RotateArrayByKPosition2 solution = new RotateArrayByKPosition2();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        System.out.println("Array after rotation by " + k1 + " places: " + Arrays.toString(nums1));

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        solution.rotate(nums2, k2);
        System.out.println("Array after rotation by " + k2 + " places: " + Arrays.toString(nums2));
    }
}
