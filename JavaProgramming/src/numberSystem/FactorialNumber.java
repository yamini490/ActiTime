package numberSystem;

import java.util.Scanner;

public class FactorialNumber {

	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number to Find Factorial : ");
    	int	num=s.nextInt();
    	int fact=1;
    	for(int i=2; i<=num; i++)
    	{
    		fact*=i;
    	}
    	System.out.println("The Factorial of " + num + "! is : " +fact);
	}
}
