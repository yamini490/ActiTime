package StringPrograms;

public class P9 {

	public static void main(String[] args) {
		String str="I Live In Bangalore";
		System.out.println(str);
		String[] str1=str.split(" ");
		for(int i=0; i<str1.length-1; i++)
		{
			for(int j=i; j<i+1 ; j++ ) {
				String temp=str1[j];
				str1[j]=str1[j+1];
				str1[j+1]=temp;
			}
			for(int k=0; k< str1.length;k++)
			{
				System.out.print(str1[k] +" ");
			}
			System.out.println();
			
		}
	}

}
