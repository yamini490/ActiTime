package numberSystem;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the length of Sequence of Fibonacci You want to Print");
	int	length=s.nextInt();
	int n1=0, n2=1;
	System.out.println("The Fibonacci Series");
		if(length==1)
			{
				System.out.println( n1 );
			}
		else if(length==2)
			{
				System.out.println( n1 + " , " + n2 );
			}
		else 
			{
				if(length>3)
					{
					   System.out.print( n1 + " , " + n2 );
					   int n3=0;
						 for(int i=3; i<=length; i++)
						 	{
							 	 n3=n1+n2;
							 	System.out.print(" , " + n3 );
							 	n1=n2;
							 	n2=n3;
			
						 	}
						 System.out.println("\nThe Fibonacci value at length " + length + " is " + n3);
					}
			}     
		
	}
}
