package pattern;

public class Ass13 {

	public static void main(String[] args) {
		int num=5;
		int sp = num-1;
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=sp; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++)
			{
				if(j==1||  i==num || j==2*i-1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			sp--;
			System.out.println();
		}


	}

}
