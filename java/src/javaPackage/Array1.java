package javaPackage;

public class Array1 {

	public static void main(String[] args) {
		
		int a []= {1,8,6,5,5,2,5};
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		int b;
		for (int i=0;i<=(a.length/2); i++)
		{
		b=a[i];
		a[i]=a[(a.length-1)-i];
       a[(a.length-1)-i]=b;
		}
		System.out.println("reverse array");
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
	   }
	}
}
