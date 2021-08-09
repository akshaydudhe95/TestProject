package PracticeOn;

public class PalindromeString {
          
	public static void main(String[] args) {
		
		String str = "mamam";
		String rev ="";
		int leng= str.length();
		for(int i=leng-1;i>=0;i--)
		{
			rev =rev + str.charAt(i);
		}
		System.out.println("Reverse string is "+ rev);
		 if (str.equals(rev))
		 {
			 System.out.println("This is a palindrome string");
		 }
		 else
		 {
			 System.out.println("This is not palindrome string");
		 }
	}
	
	
}
