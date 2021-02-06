package numberSystem;

import java.util.Scanner;

public class FactorsOfANumber {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number to find factors : ");
			int num = s.nextInt();
			System.out.println("The factors of '" + num + "' is :");
					for (int i = 1; i <= num; i++) 
					{
						if (num % i == 0) 
						{
							System.out.println(i);
						}
					}
	}
}
