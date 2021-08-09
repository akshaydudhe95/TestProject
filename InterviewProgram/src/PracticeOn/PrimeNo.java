package PracticeOn;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		        int no=19;
				int temp=0;
				for(int i=2; i<no;i++)
				{
					if(no%i==0)
					{
						temp=temp+1;
					}
				}
		if (temp==0)
		{
			System.out.println("this is a prime no");
		}
		else
		{
			System.out.println("this is not prime no");
		}
	}

}
