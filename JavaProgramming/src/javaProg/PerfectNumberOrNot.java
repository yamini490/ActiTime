package javaProg;

import java.util.Scanner;

public class PerfectNumberOrNot {

	
	public static boolean isPerfect(int num)
	{
		int sum=0;
	for(int i=1; i<=num/2; i++)
	{
		if(num%i==0) {
			sum=sum+i;
		}
		
	}
	if(sum==num)
	{
		return true;
	}
	else
	{
		return false;	
	}
		
	
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check perfect or not");
		int num=s.nextInt();
		System.out.println("Perfect Number : ----- > " +	isPerfect(num) );
	
	}

}
