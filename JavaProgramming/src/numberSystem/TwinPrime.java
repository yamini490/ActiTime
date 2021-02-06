package numberSystem;

import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter range for determining the twin prime");
		int start = s.nextInt();
		int end = s.nextInt();
		for (int i = start; i <= end; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.println("( " + i + " , " + (i + 2) + " ) ");

			}
		}
	}

	public static boolean isPrime(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) { 
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0 && num != 1) {
			return true;
		} else {
			return false;
		}
	}

}
