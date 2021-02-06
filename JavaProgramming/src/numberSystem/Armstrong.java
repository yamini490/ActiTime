package numberSystem;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong or Not : ");
	int	num=s.nextInt();
	// To find no of digits in number
	int count=0, sum=0;
	int temp=num;
	while(num>0)
	{
	count++;	
	num=num/10;
	}
	// To find ArmStrong 
	num=temp;
	while(num>0)
	{
		int rem=num%10;
		int prod=1;
		for(int i=1; i<=count; i++)
		{
			prod=prod*rem;
		}
		sum=sum+prod;
		num=num/10;
	}
	//check whether it is armstrong
	if(temp == sum)
	{
		System.out.println("The given number is Armstrong " + sum);
	}
	else
	{
		System.out.println("The given number is not Armstrong");
	}
	}

}
