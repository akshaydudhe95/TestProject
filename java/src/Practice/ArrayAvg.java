package Practice;

public class ArrayAvg {

	public static void main(String[] args) {
		
		int a[]= {12,15,7,8,9,23};
		float avg; 
		float sum=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
			System.out.println("sum of an array" +sum);
		}
		avg=sum/a.length;
		System.out.println("sum of an array" +avg);

	}

}
