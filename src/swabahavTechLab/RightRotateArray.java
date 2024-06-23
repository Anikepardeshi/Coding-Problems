package swabahavTechLab;

public class RightRotateArray {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        int n = nums.length;

        // Store the last element
        int temp = nums[n - 1];

        // Shift all elements one position to the right
        for (int i = n-1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        // Place the last element at the first position
        nums[0] = temp;

        // Print the array after right rotation
        System.out.println("Array after right rotation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
