package sorting.algorithms;

public class InsertionSort {

	private static void printArray(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 7, 8, 3, 1, 2 };

		// insertion sort
		//traversing through unsorted array
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int sorted = i - 1;
			//until sorted array elements are greater than zero and current array elements are less than sorted array elements
			while (sorted >= 0 && current < arr[sorted]) {

				//make space for new element
				arr[sorted+1] =arr[sorted];
				sorted--;
			}
			
			//placement 
			arr[sorted+1] =current;
		}
		printArray(arr);
	}

	
}
