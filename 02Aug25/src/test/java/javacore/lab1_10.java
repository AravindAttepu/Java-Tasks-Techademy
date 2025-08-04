package javacore;

public class lab1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="ANA";
		
		for(int i=1;i<test.length();i++)
		{
			if(test.charAt(i) < test.charAt(i-1))
			{
				System.out.println("String is Negative");
				break;
			}
			if(i==test.length()-1)
			{
				System.out.println("String is Positive");		
			}
		}
		

	}

}
