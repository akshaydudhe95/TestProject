package javaPackage;

public class Fourvariable {
	public static void main (String[] args)
	{
		//  no output 
		int a = 325;
		int b = 250;
		int c = 755;
		int d = 400;
		
		if (a>b)
		{
			if (a>c)
			{
				if (a>d)
				{
					System.out.println (a);
				}
				else
				{
					System.out.println (d);
				}
			}
		}
		else
		{
			if (b>c)
			{
				if (b>d)
				{
					System.out.println (b);
				}
				else
				{
					System.out.println (d);
				}
			}
			else
			{
				if (c>d)
				{
					System.out.println (c);
				}
				else
				{
					System.out.println (d);
				}
			}
		}
		
		
		
	}
}

