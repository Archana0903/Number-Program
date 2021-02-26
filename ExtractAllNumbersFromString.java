package GitHubCommit;

public class ExtractAllNumbersFromString {
	
	public static String ExtractInt (String str){
		
		str = str.replaceAll("[^\\d]", " ");
		str.trim();
		
		str = str.replaceAll(" +", " ");
		if (str.equals(""))
			return "-1";
		return str;
		
		
	}
	
	public static void main (String args[]){
		String str = "75hghfh56345kigiui";
		System.out.println(ExtractInt(str));
	}
	
}
	

	
	














