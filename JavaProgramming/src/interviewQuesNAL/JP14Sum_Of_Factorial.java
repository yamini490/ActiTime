package interviewQuesNAL;

import java.util.Scanner;
// Program to find Factorial of a number
public class JP14Sum_Of_Factorial {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number to find factorial");
	int num=s.nextInt();
	int fact=1;
	for(int i=2; i<=num; i++)
	{
		fact*=i;
	}
	System.out.println("Factorial of a number : " + fact);

	}

}
