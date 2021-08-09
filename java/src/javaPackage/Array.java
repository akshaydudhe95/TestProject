package javaPackage;

public class Array {

	public static void main(String[] args) {
	
		int [] a= {4,5,8,9,7} ;
		
	  for (int i=0;i<=(a.length-1);i++)
		{
		System.out.println(a[i]);
		}
		int b [] =new int [a.length];
		int lastindex= a.length-1;
		for (int i=0;i<=(b.length-1);i++)
		{
		   b[i]=a[lastindex];
		   lastindex--;
		}
         for (int i=0;i<=(b.length-1); i++)
              {
	              a[i]=b[i];
              }
         System.out.println("reverse array");
         for (int i=0;i<=(a.length-1);i++)
         {
        	 System.out.println(a[i]);
         }
	}
	
}
