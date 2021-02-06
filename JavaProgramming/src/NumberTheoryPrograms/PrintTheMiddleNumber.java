package NumberTheoryPrograms;

public class PrintTheMiddleNumber {

	public static void main(String[] args) {
		int a=100,b=40, c=20;
		if((b>a && a> c) || (c>a && a> b) )
		{
			System.out.println(a);
			
		}
		if((a>b && b> c) || (c>b && b> a))
		{
			System.out.println(b);
		}
	 if((a>c && c> b) || (b>c && c> a))
		{
			System.out.println(c);
		}
	}

}
