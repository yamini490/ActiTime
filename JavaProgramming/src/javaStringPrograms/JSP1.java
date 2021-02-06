package javaStringPrograms;

public class JSP1 {

	public static void main(String[] args) {
		String str="All The Best";
		int length=str.length();
		System.out.println(length);
		
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0; i< ch.length; i++)
		{
			if(ch[i]==' ')
			{
				continue;
			}
			else
			{
			count++;	
			}	
		}
		System.out.println(" Count : " + count);
		
		
	}

}
