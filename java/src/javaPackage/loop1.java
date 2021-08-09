package javaPackage;

public class loop1{
	 public static void main (String[] args)
		{	
		for (int a=1 ;a<=5;a++)
		{
			for(int b=4; b>=a ; b--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=a; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
  }