package com.java.string.reverse;

public class ReverseString
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str = "India";
				
		for (int i = str.length()-1; i >= 0 ; i--) 
		{			
			System.out.print(str.charAt(i));
		}
		System.out.println("just printed the reversed string");

	}

}
