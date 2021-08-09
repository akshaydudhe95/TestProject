package javaPackage;

public class Largest_array
{

	public static void main(String[] args) 
	{
	 int a []= {6,9,88,6,7,3};
	 int no=a[0];
	 
	 for(int i=0;i<=a.length-1;i++)
		 {
			
		if (a[i]>=no)
		{
			no=a[i];
		}
	 }
	 System.out.println("maximum "+ no);
	 }


}
