package interviewQuesNAL;

import java.util.Scanner;

// Program to check whether a number is +ve or -ve
//double data type will handle int and decimal value so v takng decimal
public class JP11Positi_Nev_Numbr {

	public static void main(String[] args) {
		// 7259388470
		//9880794781
		//9781800567
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number  :");
		double num=s.nextDouble();
		if(num<0.0)
		{
			System.out.println(num +"   Negative Number");
		}
		else if(num>0.0)
		{
			System.out.println(num +"  Positive Number");
		}
		else
			System.out.println(num +"  zero Number");


	}

}
