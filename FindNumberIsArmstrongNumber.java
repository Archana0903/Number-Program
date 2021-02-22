package GitHubCommit;

public class FindNumberIsArmstrongNumber {
	
	/*ArmstrongNumber is sum of cubes of its digit
	 * 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153 -- its a Armstrong Number
	 */
	
	public static void main (String args[]){
		
		int num = 152;
		int c = 0;
		int actualnum = num;
		
		while ( num != 0){
			
			int n = num % 10;
			num = num / 10;
			c = c + (n*n*n);
		}
		
		System.out.println("Print the amstrong output of given number " + c);
		
		if (actualnum == c)
			System.out.println("Its an Amstrong number");
		else{
			System.out.println("Its not an Amstrong number");
		}
	}

}
