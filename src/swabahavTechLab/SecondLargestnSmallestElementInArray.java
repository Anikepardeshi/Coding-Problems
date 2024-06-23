package swabahavTechLab;

public class SecondLargestnSmallestElementInArray {

	public static int findSecondLargest(int arr[]) {

		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;

		if (arr.length < 2) {
			return -1;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest;
	}
	
	
	public static int findSecondSmallest(int arr[]) {
	
		int smallest = arr[0];
		int secondSmallest = Integer.MAX_VALUE;
		
		if(arr.length < 2) {
			return -1;
		}
		
		for(int i = 1; i< arr.length;i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}else if(arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
		}
				
		
		return secondSmallest;
	}

	public static void main(String[] args) {

		int arr[] = { 12, 35, 1, 5, 32, 1, 33 };

		int secondLargest = findSecondLargest(arr);
		if (secondLargest != Integer.MIN_VALUE) {
			System.out.println("Second largest element in array is : " + secondLargest);
		} else {
			System.out.println("Therre is no second largest element in array");
		}

		
		int secondSmallest = findSecondSmallest(arr);
		if (secondSmallest != Integer.MAX_VALUE) {
			System.out.println("second Smallest element in array is : " + secondSmallest);
		} else {
			System.out.println("Therre is no second Smallest element in array");
		}

	}

}
