package javaStringPrograms;

public class JSP7 {

	public static void main(String[] args) {
		String str="abc";
	int	l=str.length();
	int temp=0;
	String[] strArray=new String[(l*(l+1))/2];	
	for(int i=0; i<l; i++)
	{
		for(int j=i; j<l; j++)
		{
			
			strArray[temp]=str.substring(i, j+1);
			temp++;
			
		}
	}
		
		for(int k=0; k<strArray.length; k++)
		{
			System.out.println(strArray[k]);
		}
		
	}

}
