package PracticeOn;

public class RevStrArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is a laptop";
		String rev="";
	      char a[]= str.toCharArray();
		
		int leng= str.length();
		
		for(int i=leng-1; i>=0 ;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("reverse string is " + rev);
	}

		
		
	}

