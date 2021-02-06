package interviewQuesNAL;

import java.util.Scanner;

public class JP16_FibonaciSeries1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number to find Length of Fibonaci Series");
		int length = s.nextInt();
		System.out.println("Fibonaci Series is ");
		int n1 = 0, n2 = 1;
		for(int i=1; i<=length; i++)
		{
			System.out.println(n1);
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}

	}

}
