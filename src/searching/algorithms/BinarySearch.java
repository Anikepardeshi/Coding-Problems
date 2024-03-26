package searching.algorithms;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target) {
	    int low = 0;
	    int high = arr.length - 1;

	    while (low <= high) {
	        int mid = low + (high - low) / 2;

	        if (arr[mid] == target) {
	            return mid; // Element found at index mid
	        } else if (arr[mid] > target) {
	            high = mid - 1; // Search left half
	        } else {
	            low = mid + 1; // Search right half
	        }
	    }

	    return -1; // Element not found
	}


    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;

        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }
}
