package Practice;
import java.lang.* ;
public class ReverseArray {
	public static void main(String[] args) {
		
 String a ="Akshay Dudhe";
	    //    yahska ehdud
	int leng =a.length();
     String rev="";
 	for( int i=leng-1;i>=0;i--)
	{
		rev=rev+a.charAt(i);;
	}
 	
  System.out.println("Reverse array  "+ rev);
  
}
}
