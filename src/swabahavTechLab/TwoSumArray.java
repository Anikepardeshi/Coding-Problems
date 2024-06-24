package swabahavTechLab;

import java.util.*;

public class TwoSumArray {
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> mp = new HashMap<>();
		
		for(int i =0; i < nums.length; i++) {
			int remaining = target - nums[i];
			
			if(mp.containsKey(remaining)) {
				return new int[] {mp.get(remaining),i};
			}
			
			mp.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		TwoSumArray solution = new TwoSumArray();
        
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 13;
        int[] result1 = solution.twoSum(nums1,target1);
        System.out.println("Indices : " + result1[0]+","+result1[1]);
        
        int[] nums2 = {3, 2, 4};
        int target2 = 1; // throw exception 
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Indices: " + result2[0] + ", " + result2[1]);

	}
}


//Iterate through nums1:
//
//Iteration 1 (i = 0):
//nums[0] = 2
//complement = 9 - 2 = 7
//map does not contain 7
//Add 2 to the map: map.put(2, 0) → map = {2=0}
//Iteration 2 (i = 1):
//nums[1] = 7
//complement = 9 - 7 = 2
//map contains 2 (index 0)
//Return indices [0, 1]
//Final output for nums1: [0, 1]
