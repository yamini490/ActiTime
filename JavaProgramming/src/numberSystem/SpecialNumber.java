package numberSystem;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to find it is special number or not : ");
		 int num=s.nextInt();
		 int temp=num;
		 int sum=0;
		 while(num>0)
		 {
			 int rem=num%10;
			 int fact=1;
			 for(int i=1; i<=rem; i++)
			 {
				 fact=fact*i;
			 }
			 sum=sum+fact;
			 num=num/10;
		 }
		if(temp==sum)
		{
			System.out.println("The given number is a Special Number");
		}
		else
		{
			System.out.println("The given number is Not a Special Number");
		}

	}

}
