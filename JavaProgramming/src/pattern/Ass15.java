package pattern;

public class Ass15 {

	public static void main(String[] args) {
		int num=5;
		char ch='a';
		int sp = num-1;
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=sp; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++)
			{
				if(j>i)
				{
					int l=ch;
					l=l-32;
					char ch1=(char)l;
					System.out.print(ch1++);
					int o=ch1;
					o=o+32;
					ch=(char)o;
				}
				else
				{
					System.out.print(ch++);
				}
			}
			sp--;
			System.out.println();
		}


	}

}
