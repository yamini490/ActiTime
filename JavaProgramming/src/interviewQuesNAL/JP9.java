package interviewQuesNAL;

import java.util.Scanner;

public class JP9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number to find largest num");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int num= a>b? (a>c? a: c):(a>b? a: b);
		System.out.println("largest :" + num);
		
	}

}
