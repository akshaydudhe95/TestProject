package Practice;

public class ArrayAsc 
{

	public static void main(String[] args) 
	{
		int a[]= {52,85,70,87,45,65,44};
		int temp=0;
		
		System.out.println("orginal Array");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("   "+a[i]);
		}
		System.out.println();
		System.out.println("Ascending Order");
		for (int i=0;i<=a.length-1;i++)
		{ 
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]>=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print("  " +a[i]);
		}	
	}
}
