package PracticeOn;

public class RevNumber {
       
	public static void main(String[] args) {
		
		int number=74565;
		int temp;
		int rev=0;
	
		
		while(number > 0)
		{
			temp = number%10;
			rev= rev*10+temp;
			number=number/10;	
		}
		System.out.println("Reverse number is ="+ rev);
		
	}
}
