package numberSystem;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to Find Sum Of Digits:");
		int num=s.nextInt();
		int sum=0;
		while(num>0)
		{
			int	rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
       System.out.println("The sum of Digits is "+ sum);
	}
}
