package GitHubCommit;

public class FindSmallestLargestNumber {
	
	public static void main (String args[]){
		
		int[] number = new int[] {23,12,63,72,77,25,93};
		int largest = number[0];
		int smallest = number[0];
		
		for (int i=0;i<number.length;i++){
			if(number[i] > largest){
				largest = number[i];
			}
			
			else if (number[i] < smallest){
				smallest = number[i];
			}
		}
		
		System.out.println("Largest number in the given array -- > " + largest);
		System.out.println("Smallest number in the given array -- > " + smallest); 
		
	}

}
