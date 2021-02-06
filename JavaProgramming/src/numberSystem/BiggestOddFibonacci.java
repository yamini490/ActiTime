package numberSystem;

import java.util.Scanner;

public class BiggestOddFibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range to find Biggest Odd Fibonacci :");
		int lowest = s.nextInt();
		int highest = s.nextInt();
		int n1 = 0, n2 = 1, n3=0, big=0;
		if (lowest == 0 && highest == 1) 
		{
			System.out.println(n2);
		 }
		else 
		{
			while((n1+n2)<=highest)
			{
				n3=n1+n2;
				if(n3%2 !=0 && n3>=lowest)
				{
					big=n3;
				}
				n1=n2;
				n2=n3;
			}
			System.out.println("Biggest Odd Fibonacci " + big);
		}
	}

}