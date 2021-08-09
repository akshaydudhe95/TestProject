package javaPackage;

public class loop4 {
	
	// larest no from from 5 digit
	
	public static void main(String[] args) {
		
		int a=1882;
		int b=1886;
		int c=885;
		int d=12555;
		int e=2855;
		
		if ((a>b)&&(a>c)&&(a>d)&&(a>e))
		{
			System.out.println(a);
		}
		if ((b>a)&&(b>c)&&(b>d)&&(b>e))
		{
			System.out.println(b);
		}
		if ((c>b)&&(c>a)&&(c>d)&&(c>e))
		{
			System.out.println(c);
		}
		if ((d>b)&&(d>c)&&(d>a)&&(d>e))
		{
			System.out.println(d);
		}
		if ((e>b)&&(e>c)&&(e>d)&&(e>a))
		{
			System.out.println(e);
		}
	}

}
