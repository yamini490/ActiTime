package javaStringPrograms;
/*
 * 3) Java Program to count the total number of punctuation characters exists in
a String
 */
public class JSP2 {

	public static void main(String[] args) {
		
	String	str = "Good Morning! Mr. James Potter. Had your breakfast?";
	//char[] ch=str.toCharArray();
	int count=0;
	for(int i=0 ; i<str.length(); i++)
	{
	char	ch=str.charAt(i);
		if(!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9' || ch <= ' '  ) )
		{
			count++;
		}
	}
	System.out.println(count);
	}

}
