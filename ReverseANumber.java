package GitHubCommit;

public class ReverseANumber {
	
	public static void main (String args[]){
		
		int num = 12345;
		int rev = 0;
		
		while (num != 0){
			
			int n = num % 10;
			rev = rev*10 + n;
			num = num/10;
			
		}
		System.out.println("Reversed number is " + rev);
		
	}

}
