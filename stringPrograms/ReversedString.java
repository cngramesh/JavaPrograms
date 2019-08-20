package stringPrograms;

import java.util.Scanner;

public class ReversedString {

	 static String reveseString(String str)
	{
		 String revStr = "";
		 
		 for(int i =str.length()-1;i>=0;i--)
		 {
			 revStr = revStr + str.charAt(i);
		 }
		return revStr;
		
	}
	
		public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		System.out.println("Enter string to reverse:");
		String str1 = str.nextLine();
		String revStr = reveseString(str1);
		System.out.println("Original String:"+str1);
		System.out.println("Reversed String:"+revStr);
	}

}
