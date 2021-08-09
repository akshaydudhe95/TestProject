package PracticeOn;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="akshay";
      String s2 = "shayak";
      
      if(s1.length()!=s2.length())
       {
	System.out.println("1.Actual string");
       }
      else {
      s1= s1.concat(s1);
		
		if(s1.indexOf(s2)!=-1)
		{
			System.out.println("2.Actual string");
		}
		else
		{
			System.out.println("Actual is not string");
		}
      }		
	}

}
