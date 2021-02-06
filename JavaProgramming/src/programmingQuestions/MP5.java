package programmingQuestions;
/*
 * 5) Armstrong number
Write a java program to check Armstrong number.
Input: 153
Output: Armstrong number
Input: 22
Output: not Armstrong number
 */
public class MP5 {
	public static void checkArmStrong(int num) {
		System.out.println(" checking armstrong or not");
		int temp=num;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		num = temp;
		int sum=0; 
		while(num>0)
		{
			int digit =num%10;
			int prod=1;
			for(int i=1; i<=count; i++)
			{
				prod=prod*digit;
			}
			sum=sum+prod;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println(" Armstrong number -- > " + sum);
		}
		else
		{
			System.out.println(" Not Armstrong number -- >" + sum);	
		}
		System.out.println("\n Execution is completed ");	
			
	}

	public static void main(String[] args) 
	{
		checkArmStrong(153);
		checkArmStrong(22);

	}

}
