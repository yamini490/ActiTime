package StringPrograms;

import java.util.Arrays;

// Write a program to check whether given two strings are anagrams.
public class P14 {

	public static void main(String[] args) {
		String str1="the eyes";
		String str2="they see";
		boolean isAnagram=true;
char[] ch1=str1.toCharArray();
char[] ch2=str2.toCharArray();
if(ch1.length==ch2.length)
{
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	for(int i=0; i< ch1.length; i++)
	{
		if(ch1[i]!=ch2[i])
		{
			isAnagram=false;
		}			
	}
	if(isAnagram)
	{
		System.out.println("The Given String is Anagram");
	}
	else
		System.out.println("The Given Strings is Not Anagram");
}
else
{
	System.out.println("The Given two Strings are not anagram");
}
	}

}
