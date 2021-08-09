package PracticeOn;

public class StringSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="  akshay      dudhe  ";
		System.out.println("original string is:"+ str);
        int leng=str.length()-1; 
		for(int i=0;i<=leng;i++)
		{
			if(str.charAt(i)!=' ')
			{
				System.out.print(str.charAt(i));
			}
		}
		
	}

}
