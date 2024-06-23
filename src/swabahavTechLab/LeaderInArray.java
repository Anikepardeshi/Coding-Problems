package swabahavTechLab;

//A leader element in an array is an element that is greater than all the elements to its right. 
//In other words, for an element to be considered a leader, there should be no larger element to its right in the array.

public class LeaderInArray {

	public static void main(String[] args) {
		
		int arr[] = {16,17,4,3,5,2};
		int n = arr.length;
		
		System.out.println("Leader element in the array are : ");
		
		//last element is always a leader
		int maxFromRight = arr[n-1];
		System.out.print(maxFromRight + " ");
		
		 // Traverse the array from second last element to the first
		for (int i = n-2; i >= 0; i--) {
			if(arr[i] > maxFromRight) {
				maxFromRight = arr[i];
				System.out.print(maxFromRight+ " ");
			}
		}
	}
}
