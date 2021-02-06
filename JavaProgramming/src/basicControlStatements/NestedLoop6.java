package basicControlStatements;

public class NestedLoop6 {

	public static void main(String[] args) {
		for(int i=1 ; i<=5; i++)
		{
			int j=1;
			while(j<=i)
			{
				System.out.println("hello");
				j++;
			}
			System.out.println();
		}


	}

}
