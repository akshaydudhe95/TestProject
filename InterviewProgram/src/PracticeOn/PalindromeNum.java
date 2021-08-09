package PracticeOn;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int no=98789;
		int temp,rev=0;
		int org=no;
	
		while(no>0)
		{
			temp=no%10;
			rev=rev*10+temp;
			no=no/10;
		}
		
		if (rev==org)
		{
			System.out.println("This is palindrome number");
		}
		else
		{
			System.out.println("This is not palindrome number");
		}
	}

}
