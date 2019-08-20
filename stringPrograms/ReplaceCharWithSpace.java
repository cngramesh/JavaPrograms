package stringPrograms;

public class ReplaceCharWithSpace {

	public static void main(String[] args) {

		String str = "Java is a powerful programming language";
		
		String new_string = str.replace(" ","*");
		
		System.out.println("Original String: "+str);
		System.out.println("Replaced String: "+new_string);
	}

}
