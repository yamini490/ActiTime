package numberSystem;

import java.util.Scanner;

public class PerfectNumber {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter a number to find Perfect Number or Not");
		int num = s.nextInt();
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) 
		{
				if (num % i == 0) 
				{
					sum = sum + i;
				}
		}
		if (sum == num) {
							System.out.println("The Given num --> " + sum + " is Perfect Number");
						} 
		else
			System.out.println("The Given num --> " + num + " is  Not Perfect Number  " + sum);
	}
}
