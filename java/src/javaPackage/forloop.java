package javaPackage;

public class forloop {
	public static void main (String[] args) {
		for (int a=5 ; a>=1 ; a--)
		{
			for(int b=1 ;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a=2 ; a<=5 ; a++)          // a=2 instead of a=1
		{
			for(int b=1 ;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
}
}