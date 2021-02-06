package programmingQuestions;

import java.util.Scanner;

/*
 * 2) Prime number
Write a java program to check prime number.
Input: 44
Output: not prime number
Input: 7
Output: prime number
 */
public class MP2 {

	public static void main(String[] args) {
		int s1=44;
		int s2=7;
		isPrime(s1);
		isPrime(s2);
	}
public static void isPrime(int num)
{
	boolean	flag = true;
	for(int i=2; i<=num/2; i++)
	{
		if(num%i==0)
		{
			flag=false;
			break;
		}
		
	}
	if(flag)
	{
		System.out.println("The Given Num ' " + num + " ' is Prime");
	}
	else
	{
		System.out.println("The Given Num ' " + num + " ' is Not Prime");
	}
}
}
