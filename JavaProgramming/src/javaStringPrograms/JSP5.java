package javaStringPrograms;

import java.util.Arrays;

public class JSP5 {

	public static void main(String[] args) {
String	str1="Listen";
String  str2="Silent";
str1=str1.toLowerCase();
str2=str2.toLowerCase();
boolean flag=true;
if(str1.length()==str2.length())
{
char[] cha=str1.toCharArray();
char[] chb=str2.toCharArray();
Arrays.sort(cha);
Arrays.sort(chb);
	
	for(int i=0; i< cha.length ; i++)
	{
		if(cha[i] != chb[i])
		{
		  flag= false;
		  break;
		}
	}
	if(flag)
	{
		System.out.println("Anagram");
		
	}
	else
	{
		System.out.println("Not Anagram");
		
	}
}
else
	System.out.println("Not Anagram");
		
	}

}
