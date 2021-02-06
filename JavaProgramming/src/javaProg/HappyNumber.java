package javaProg;

public class HappyNumber {

	
	public static void checkHappyNumber(int num)
	{
		 int sum=0;
		while(num>0) 
		{
			int rem=num%10;
			int seq=rem*rem;
			sum=sum+seq;
			num=num/10;
		}
		if(sum==1)
		{
			System.out.println("Happy number");
		}
		else if(sum==4)
		{
			System.out.println("Not a happy number");
		}
		else
		{
			checkHappyNumber(sum);
		}
		
	}
	public static void main(String[] args) {

	checkHappyNumber(42);	
	}

}
