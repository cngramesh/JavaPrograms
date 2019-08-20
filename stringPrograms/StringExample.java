package stringPrograms;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "Java";
		
		char ch[] =  {'r','a','m','e','s','h'};
		
		//Converting char array to string.
		String s2 = new String(ch);
		System.out.println(s2);
		
		String s3 = new String("ramesh");
		System.out.println(s3);
		System.out.println("Lenth of s2:"+s2.length());

	}

}
