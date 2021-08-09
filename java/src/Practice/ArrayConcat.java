package Practice;

import java.util.Arrays;

public class ArrayConcat {

	public static void main(String[] args) {
		
		int a[]= { 82,68,77,92,18,25};
		int b[]= { 7,44,58,94,65,55};
		
		int aleng= a.length;
		int bleng= b.length;
		
		int result[]= new int[aleng+bleng];
		
		System.arraycopy(a,0,result,0,aleng);
		System.arraycopy(b,0,result,aleng,bleng);
		
		System.out.println(Arrays.toString(result));	
		
	}

}
