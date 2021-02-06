package interviewQuesNAL;

import java.util.Scanner;

public class JP16_FibonaciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number to find Length of Fibonaci Series");
		int length = s.nextInt();
		System.out.println("Fibonaci Series is ");
		int n1 = 0, n2 = 1;
		if (length == 1) {
			System.out.println(n1);
		} else if (length == 2) {
			System.out.println(n1 + " , " +n2);
		} else {
			System.out.print(n1 + " , " + n2 + " , ");
			for (int i = 3; i <= length; i++) {
				int n3 = n1 + n2;
				System.out.print(n3 + " , ");
				n1 = n2;
				n2 = n3;
			}
		}
	}

}
