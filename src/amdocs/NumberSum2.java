package amdocs;

import java.util.HashMap;
import java.util.Map;

public class NumberSum2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
        NumberSum2 solution = new NumberSum2();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        
        System.out.println("result Indices: " + result[0] + ", " + result[1]);
        System.out.println("result Elements: " + nums[result[0]] + ", " + nums[result[1]]);
    }

}



//public class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//    public static void main(String[] args) {
//    NumberSum2 solution = new NumberSum2();
//    int[] nums = {3, 2, 4};
//    int target = 6;
//    int[] result = solution.twoSum(nums, target);
//    
//    System.out.println("result Indices: " + result[0] + ", " + result[1]);
//    System.out.println("result Elements: " + nums[result[0]] + ", " + nums[result[1]]);
//}
//}

