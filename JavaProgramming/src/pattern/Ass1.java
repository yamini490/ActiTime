package pattern;

import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No of rows : ");
		int row=s.nextInt();
		char ch='a';
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(ch++);
			}
			System.out.println();
		}


	}

}
