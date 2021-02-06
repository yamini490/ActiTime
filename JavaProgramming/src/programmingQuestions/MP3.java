package programmingQuestions;
/*
 * 3) Palindrome number
Write a java program to check palindrome number.
Input: 329
Output: not palindrome number
Input: 12321
Output: palindrome number
 */
public class MP3 {
public static void isPalindrome(int num)
{
	int temp=num;
	int rev=0;
	while(num>0)
	{
	int	digit=num%10;
	rev=rev*10 + digit;
	num/=10;
	}
	if(rev==temp)
	{
		System.out.println(temp + " palindrome number ");
	}
	else
		System.out.println(temp + " not a palindrome number ");
}
	public static void main(String[] args) 
	{
		isPalindrome(329);
		isPalindrome(12321);
	}

}
