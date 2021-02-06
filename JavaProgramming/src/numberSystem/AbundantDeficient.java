package numberSystem;

import java.util.Scanner;

public class AbundantDeficient {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check ABUNDANT or DEFICIENT");
		int num=s.nextInt();
		int sum=0;
		for(int i=1; i<=num/2; i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum>num)
		{
			System.out.println("The Given --> "+num+" is ABUNDANT ");
		}
		else
		{
			System.out.println("The Given --> "+num+" is DEFICIENT ");
		}
	}

}
