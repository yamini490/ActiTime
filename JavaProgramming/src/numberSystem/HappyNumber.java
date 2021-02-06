package numberSystem;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check Whether it is Happy Number or Not");
		int num = s.nextInt();
		checkHappyNumber(num); 
	}

	public static void checkHappyNumber(int num) {
		int sum = 0;
		while (num > 0) {
			int prod = 1;
			int rem = num % 10; // 9

			for (int i = 0; i <= 1; i++) {
				prod = prod * rem;
			}
			sum = sum + prod;
			num = num / 10;
		}
		if (sum == 1) 
		{
			System.out.println("Happy Number");
		} 
		else if (sum == 4) 
		{
			System.out.println(" Not a Happy Number");
		} 
		else 
		{
			checkHappyNumber(sum);
		}
	}
}
