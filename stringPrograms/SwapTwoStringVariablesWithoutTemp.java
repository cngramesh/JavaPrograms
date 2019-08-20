package stringPrograms;

public class SwapTwoStringVariablesWithoutTemp {

	public static void main(String[] args) {
		
		String str1 ="Good";
		String str2 ="Morning";
		
		System.out.println("Strings before swapping: "+str1 +" " + str2);
		
		str1 = str1+str2;
		//Goodmorning
		
		//Extract str2 from udpated str1
		str2 = str1.substring(0,(str1.length()-str2.length()));

		//Extract str1 from updated str1
		str1 = str1.substring(str2.length());
		
		System.out.println("Strings after swapping: "+str1 +" " + str2);
		
	}

}
