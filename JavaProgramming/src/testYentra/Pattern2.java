package testYentra;

import java.util.ArrayList;

public class Pattern2 {

	public static void main(String[] args) {
	
		int num=475761;
		int temp=num;
		
		ArrayList al = new ArrayList();
		
		while(num>0)
		{
			al.add(num%10);
			num=num/10;
		}
		num=temp;
		int k=al.size()-1;
		
		for(int i=0; k>=0; i++)
		{
			for(int j=0; j<=i && k>=0 ; j++)
			{
				System.out.print(al.get(k--)+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
