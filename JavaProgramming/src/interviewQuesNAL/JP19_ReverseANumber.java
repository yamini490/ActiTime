package interviewQuesNAL;

import java.util.Scanner;
// 54321
public class JP19_ReverseANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digits to reverse :");
		int num=s.nextInt();
		int rev=0;
while(num>0)
{
	int rem=num%10;
	rev=rev*10 + rem;
	num=num/10;
	
}
System.out.println(" Reverse Number is : " + rev);
	}

}
