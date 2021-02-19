package GitHubCommit;

public class SwapTwoNumber {
	
	public static void main (String args[]){
		
		int a = 10;
		int b = 20;
		
		System.out.println("Value of a before swapping " + a);
		System.out.println("Value of b before swapping " + b);
		
		a = a+b; //a=30, b=20
		b = a-b; //a=30, b=10
		a = a-b; //a=20, b=10
		
		System.out.println("Value of a after swapping " + a);
		System.out.println("Value of b after swapping " + b);
	}

}
