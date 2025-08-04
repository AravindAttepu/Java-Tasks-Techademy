package javacore;

import java.util.HashSet;
import java.util.Set;

public class lab1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="aravind";
		
		System.out.println(test.concat(test));
		System.out.println(replaceodd(test));
		System.out.println(removeduplicate(test));
		System.out.println(changeodd(test));

	}
	public static String replaceodd(String teString) {
		StringBuilder sb= new StringBuilder(teString);
		for(int i=1;i<=sb.length();i++)
		{
			if(i%2 !=0)
			sb.setCharAt(i-1, ' ');
		}
		return String.valueOf(sb);
		
	}
	public static String removeduplicate(String teString)
	{
		
		
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<teString.length();i++)
		{
					char c= teString.charAt(i);
					if(sb.indexOf(String.valueOf(c)) == -1)
					{
						sb.append(c);
					}
				}
		return sb.toString();
		
		
	}
	public static String changeodd(String teString) {
		StringBuilder sb= new StringBuilder(teString);
		for(int i=1;i<=sb.length();i++)
		{
			char c = teString.charAt(i-1);
			if(i%2 !=0)
			{
			sb.setCharAt(i-1, Character.toUpperCase(c) );
			}
		}
		return String.valueOf(sb);
		
	}

}
