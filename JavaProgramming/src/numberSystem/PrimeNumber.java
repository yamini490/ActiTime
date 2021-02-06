package numberSystem;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is Prime or Not :");
		int num=s.nextInt();
		int count=0; // To keep track of No of FACTORS
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0 && num != 1)
		{
			System.out.println("The Given '" + num + "' is Prime Number");
		}
		else
			System.out.println("The Given '" + num + "' is Not Prime Number");
	}
}
