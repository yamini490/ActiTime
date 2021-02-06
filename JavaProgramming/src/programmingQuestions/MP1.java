package programmingQuestions;
/*
 * 1) Fibonacci series
Write a java program to print fibonacci series without using recursion and using
recursion .
Input: 10
Output: 0 1 1 2 3 5 8 13 21 34
 */
public class MP1 {

	public static void main(String[] args) {
		int num=10, n1=0, n2=1;
		if(num==1)
		{
			System.out.println(n1+ " ");
	    }
		else if(num==2)
		{
			System.out.println(n1+ " " + n2);
		}
		else if(num>3)
		{
			System.out.print(n1+ " " + n2 );
			for(int i=3 ; i<= num ; i++)
			{
			int n3=n1+n2;
			System.out.print(" "+ n3);
			n1=n2;
			n2=n3;
			}
		}

}
}