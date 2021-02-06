package pattern;

import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of rows ");
		int row=s.nextInt();
		for(int i=1; i<=row; i++) // loop for rows
		{
			for(int j=1; j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
