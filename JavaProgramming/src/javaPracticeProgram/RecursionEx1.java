package javaPracticeProgram;

public class RecursionEx1 {
	public static void print(int n)
	{
	System.out.println(n);
	n--;
	if(n==0) {
		return ;
	}
	
	print(n);
	System.out.println("---"+ n);
	}
public static void main (String[] args)
{
	
	print(10);
	
	}

}
