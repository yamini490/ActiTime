package StringPrograms;

import java.util.Arrays;

public class P4 {

	public static void main(String[] args) {
		String str="WELCOME";
		char[] ch=str.toCharArray();
		for(int i=0; i< ch.length-1;i++)
		{
			
			char c=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=c;
			
			System.out.println(String.valueOf(ch));
			
		}
		
	}
}
