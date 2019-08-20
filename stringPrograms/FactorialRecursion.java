package stringPrograms;

import java.util.Scanner;

public class FactorialRecursion {
	
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
		return (n*factorial(n-1));
	}

	public static void main(String[] args) {
		
		Scanner np = new Scanner(System.in);
		System.out.println("Enter number to find out the factorial:");
		int fact1 = np.nextInt();
		
		int fact;
		fact = factorial(fact1);
		System.out.println("Factorial of " +fact1 + " = "+fact);
	}

}
