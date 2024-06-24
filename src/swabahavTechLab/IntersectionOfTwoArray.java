package swabahavTechLab;

import java.util.*;

public class IntersectionOfTwoArray {

	// Approach-1 (Using two sets) simplest
	// T.C : O(m+n)
	// S.C : O(m+n)
//	public int[] intersection(int[] nums1, int[] nums2){
//		Set<Integer> st1 = new HashSet<>();
//		Set<Integer> st2 = new HashSet<>();
//		
//		for(int i = 0; i < nums1.length; i++) {
//			st1.add(nums1[i]);
//		}
//		
//		for (int i = 0; i < nums2.length; i++) {
//			if(st1.contains(nums2[i])) {
//				st2.add(nums2[i]);
//			}
//		}
//		
//		int[] result = new int[st2.size()];
//		int i = 0;
//		for(Integer num : st2) {
//			result[i++] = num;
//		}
//		return result;
//	}

	// Approach-2 (Using one set)
	// T.C : O(m+n)
	// S.C : O(m)
//	public int[] intersection(int[] nums1, int[] nums2) {
//		Set<Integer> set = new HashSet<>();
//		List<Integer> result = new ArrayList<>();
//		
//		for(int num : nums1) {
//			set.add(num);
//		}
//		
//		for(int num : nums2) {
//			if(set.contains(num)) {
//				result.add(num);
//				set.remove(num);
//			}
//		}
//		return result.stream().mapToInt(Integer :: intValue).toArray();
//	} 

	// Approach-3 (Sorting and binary search)
	// T.C : O(n + mlogm)
	// S.C : O(n)
//	public int[] intersection(int[] nums1, int[] nums2) {
//		Arrays.sort(nums1);
//		List<Integer> nums1List = new ArrayList<>();
//
//		for (int num : nums1) {
//			nums1List.add(num);
//		}
//
//		Set<Integer> set = new HashSet<>();
//
//		for (int num : nums2) {
//			if (binarySearch(nums1List, num)) {
//				set.add(num);
//			}
//		}
//		
//		return set.stream().mapToInt(Integer :: intValue).toArray();
//	}
//
//	public boolean binarySearch(List<Integer> nums, int target) {
//		int left = 0;
//		int right = nums.size() - 1;
//
//		while (left <= right) {
//			int mid = left + (right - left) / 2;
//			
//			if(nums.get(mid) == target) {
//				return true;
//			}else if(nums.get(mid) < target) {
//				left = mid + 1;
//			}else {
//				right = mid - 1;
//			}
//		}
//		return false;
//	}

	
	//Approach-4 (Sorting and two-pointers)
	//T.C : O(n + m)
	//S.C : O(1)
	public int[] intersection(int[] nums1, int[] nums2) {
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int m = nums1.length;
		int n = nums2.length;
		
		List<Integer> result = new ArrayList<>();
		int i =0, j =0;
		
		while (i < m && j < n) {
			if(nums1[i] == nums2[j]) {
				result.add(nums1[i]);
				
				while(i < m-1 && nums1[i] == nums1[i+1]) {
					i++;
				}
				while(j < n-1 && nums2[j] == nums2[j+1]) {
					j++;
				}
				i++;
				j++;
			}else if (nums1[i] < nums2[j]) {
				i++;
			}else {
				j++;
			}
			
		}
		
		return result.stream().mapToInt(Integer :: intValue).toArray();
	}

	public static void main(String[] args) {

		IntersectionOfTwoArray solution = new IntersectionOfTwoArray();
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] result1 = solution.intersection(nums1, nums2);
		System.out.print("Intersection of nums1 and nums2: ");
		for (int num : result1) {
			System.out.print(num + " ");
		}
		System.out.println(); // Output: [2]

		int[] nums3 = { 4, 9, 5 };
		int[] nums4 = { 9, 4, 9, 8, 4 };
		int[] result2 = solution.intersection(nums3, nums4);
		System.out.print("Intersection of nums3 and nums4: ");
		for (int num : result2) {
			System.out.print(num + " ");
		}
		System.out.println(); // Output: [4, 9] or [9, 4]
	}
}
