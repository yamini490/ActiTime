package interviewQuesNAL;

import java.util.Scanner;
// 1234
public class JP18_CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digits");
		int num=s.nextInt();
		int temp=num;
		int k=0;
		while(num>0) {
			k++;
			num=num/10;
		}
		System.out.println("The no of digits in " + temp +  " is "  + k);
	}

}
