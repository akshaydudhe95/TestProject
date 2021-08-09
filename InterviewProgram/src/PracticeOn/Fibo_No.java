package PracticeOn;

public class Fibo_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		int c;
		System.out.print(a+"  "+b+"  ");
		
		for (int i=1;i<=7;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		
	}

}
