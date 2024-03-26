
// find the equilibrium of the string i.e find the element in array, for whom the sum of elements on left side is equal to the sum of element on right side

package rajasoftwarelab;

public class EquilibriumIndex {

	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		int arr_size = arr.length;
		
		int equilibriumIndex = findEquilibriumIndex(arr, arr_size);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index found at index: " + equilibriumIndex);
            System.out.println("Element at equilibrium index: " + arr[equilibriumIndex]);
        } else {
            System.out.println("Equilibrium index not found in the array.");
        }

	}

	public static int findEquilibriumIndex(int arr[], int arr_size) {
		
		if (arr_size == 1) {
	        return 0; 
	    } else if (arr_size == 2) {
	        if (arr[0] == arr[1]) {
	            return 0; 
	        } else {
	            return -1;   
	        }
	    }
		
        int sum = 0;
        int leftSum = 0;

        for (int i = 0; i < arr_size; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr_size; ++i) {
            sum -= arr[i];

            if (leftSum == sum) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }
}
