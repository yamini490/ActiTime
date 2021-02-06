package interviewQuesNAL;

import java.util.Scanner;

//JAVA program to compute quotient and remainter
public class JP5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to divident");
		int a=s.nextInt();
		System.out.print("/");
		int b=s.nextInt();
		System.out.println("Qoutient : " + a/b);
		System.out.println("Remainder : " + a%b);
		
		
		

	}

}
