package interviewQuesNAL;

import java.util.Scanner;

public class JP7 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number to check whether Even or odd :");
		int num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd ");
		}
	}

}
