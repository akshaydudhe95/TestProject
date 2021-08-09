package PracticeOn;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "This is a laptop";
		String rev="";
		int leng= a.length();
		
		for(int i=leng-1; i>=0 ;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println("reverse string is =" + rev);
	}
}
