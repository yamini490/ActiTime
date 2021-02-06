package numberSystem;

import java.util.Scanner;

public class CloudNix {

	public static void main(String[] args) 
	{
		System.out.println("This is the Function of CLOUD and NIX , \n CLOUD means divisible by  3, NIX means divisible by 7, CLOUDNIX divisible by 3 and 7" );
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Range" );
	int	lowest=s.nextInt();
	int highest=s.nextInt();
	System.out.println("The Sequence of given range :");
	for(int i= lowest ; i<= highest; i++)
	{
		if(i%3==0 && i%7==0)
		{
		  System.out.print(" CLOUDNIX ");
		}
		else if (i%3==0)
		{
			System.out.print(" CLOUD ");
		}
		else if(i%7==0)
		{
			System.out.print(" NIX ");
		}
		else
		{
			System.out.print(" "+ i + " ");
		}
	}
	}

}
