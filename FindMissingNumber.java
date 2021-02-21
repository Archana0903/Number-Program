package GitHubCommit;

public class FindMissingNumber {
	
	public static void main (String args[]){
		
		int[] num = new int[] {1,2,3,4,6,7,8,9};
		
		int sum = 0;
		
		for (int i=0;i<num.length;i++){
			sum = sum + num[i];
		}
		System.out.println("Sum of given array " + sum);
		
		int sum1 = 0;
		
		for (int j=0;j<=9;j++){
			sum1 = sum1 + j;
		}
		System.out.println("Sum of array including the missing number " + sum1);
		System.out.println("Missing number is " + (sum1-sum));
		
	}

}
