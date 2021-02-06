package interviewQuesNAL;

import java.util.Scanner;

public class JP13Sum_Of_NaturalNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number to Total sum of its Natural num");
		int num=s.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Natural Number  : " + sum);
		int k=1;
	   sum=0;
		while(k<=num)
		{
			sum =sum+k++;
		}
		System.out.println("Sum of Natural Number  : " + sum);
	}

}
