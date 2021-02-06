package pattern;

import java.util.Scanner;

public class Ass6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the No of rows : ");
		int row=s.nextInt();
		 char ch='a';
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<row; j++)
			{
				if(i+j >= row-1)
				{
				System.out.print(ch++);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		

	}

}
