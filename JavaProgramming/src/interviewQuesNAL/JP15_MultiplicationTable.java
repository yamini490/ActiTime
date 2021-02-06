package interviewQuesNAL;

import java.util.Scanner;

public class JP15_MultiplicationTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println(" Enter a number to generate the Multiplication_table : ");
	int num=s.nextInt();
	System.out.println("The " + num + " Multiplication Table");
	for(int i=1; i<=15; i++)
	{
		System.out.println(i + " X " + num + " = " + (i*num));
	}
	}

}
