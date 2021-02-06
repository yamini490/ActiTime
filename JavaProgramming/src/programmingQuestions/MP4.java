package programmingQuestions;
/*
 * 4) Factorial number
 * 5=5*4*3*2*1
Write a java program to print factorial of a number.
Input: 5
Output: 120
Input: 6
Output: 720
 */

public class MP4 {
public static void printFactorial(int num)
{
	int fact=1;
	while(num>1) {
		fact=fact*num;
		num--;
	}
	System.out.println("Factorial " + fact);
}
	public static void main(String[] args) {
		printFactorial(5);
		printFactorial(6);
	}

}
