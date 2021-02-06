package pattern;

public class Ass11 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0; i<n ; i++) {
			int col=0;
			int k=1;
			char ch='A';
			for(int j=0; j<n; j++) {
				if(i+j >= n-1)
				{
					if(col%2==0)
					{
						System.out.print(k++);
					}
					else
					{
						System.out.print(ch++);
					}
			col++;		
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
