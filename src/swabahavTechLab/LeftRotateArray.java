package swabahavTechLab;

public class LeftRotateArray {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6 };

		
		
		int temp = nums[0];

		for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
		nums[nums.length -1] = temp;
		
		System.out.println("Array after left rotation : ");
		for(int num : nums) {
			System.out.print(num + " ");
		}
	}
}
