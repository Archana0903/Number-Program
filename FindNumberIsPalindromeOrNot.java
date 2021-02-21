package GitHubCommit;

public class FindNumberIsPalindromeOrNot {
	
	public static void main (String args[]){
		
		int num = 123;
		int rev = 0;
		int actualnum = num;
		
		while (num != 0){
			
			int n = num % 10;
			rev = rev*10 + n;
			num = num/10;
		}
		
		System.out.println("number after reversing --> " + rev);
		if (actualnum == rev){
			System.out.println("Given number is Palindrome");
		}
		else{
			System.out.println("Given number is not a Palindrome");
		}
	}

}
