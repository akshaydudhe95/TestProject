package Practice;

public class MOverloading 
{
	void school(int a,int b)
	{
		System.out.println("Akshay");
	}
	void school(char c)
	{
		System.out.println("IDMS");
	}
	void school(String s)
	{
		System.out.println("String");
	}
	
	
	public static void main(String[] args)
	{
		MOverloading  c=new MOverloading();
		c.school('Y');
		c.school(11,12);
		c.school("Hello");
	}
}
