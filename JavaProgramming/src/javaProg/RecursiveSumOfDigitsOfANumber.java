package javaProg;

public class RecursiveSumOfDigitsOfANumber {
static int sum=0;
public static int sumOfDigitIs(int num)
{
	if(num==0)
	{
		return 0;
	}
	while(num>0) {
		int rem=num %10;
		sum=sum + rem;
		
	}
	return sumOfDigitIs(num/10);
}
public static void main(String[] args)
{
	int res = sumOfDigitIs(1234555);
	System.out.println(res);
}


}
