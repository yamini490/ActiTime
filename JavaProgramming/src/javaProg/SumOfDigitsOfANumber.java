package javaProg;

public class SumOfDigitsOfANumber {

	public static int sumOfDigitIs(int num)
	{
	int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum + rem;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int res = sumOfDigitIs(1234555);
		System.out.println(res);

	}

}
