package swabahavTechLab;

import java.util.*;

public class RemoveDuplicatesInArray {

//  using SET 	
//	public static int[] removeDuplicates(int nums[]) {
//		
//		if(nums.length == 0) return nums;
//		
//		Set<Integer> uniqueElements = new LinkedHashSet<>();
//		for(int num : nums) {
//			uniqueElements.add(num);
//		}
//		
//		int result[]= new int[uniqueElements.size()];
//		int index = 0;
//		for(int num : uniqueElements) {
//			result[index++] = num;
//		}
//		
//		
//		return result;
//	}

	// using two pinter approach (Optimized)
	public static int[] removeDuplicates(int nums[]) {
		if (nums.length == 0)
			return nums;

		int unique = 0;

		for (int current = 1; current < nums.length; current++) {
			if (nums[current] != nums[unique]) {
				unique++;
				nums[unique] = nums[current];
			}
		}

		int[] result = new int[unique + 1];
		for (int i = 0; i < result.length; i++) {
			result[i] = nums[i];
		}

		return result;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 1, 2, 2, 3, 4, 5, 5, 5, 6, 6 };
		int uniqueArray[] = removeDuplicates(nums);

		System.out.println("Array with unique elements : ");
		for (int num : uniqueArray) {
			System.out.print(num + " ");
		}
	}
}
