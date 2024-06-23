package swabahavTechLab;

//A leader element in an array is an element that is greater than all the elements to its right. 
//In other words, for an element to be considered a leader, there should be no larger element to its right in the array.

public class LeaderInArray2 {

	public static void findLeaderElement(int arr[]) {
		for(int i = 0; i< arr.length;i++) {
			boolean isLeader = true;
			
			for(int j = i+1; j< arr.length;j++) {
				if(arr[i] <= arr[j]) {
					isLeader = false;
					break;
				}
			}
			
			if(isLeader) {
				System.out.println(arr[i] + " ");
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {16,17,4,3,5,8};
		
		System.out.println("Leader element in array : ");
		findLeaderElement(arr);
	}
}
