package javaStringPrograms;
/*
 * 4) Java Program to count the total number of vowels and consonants in a
string
 */
public class JSP3 {

	public static void main(String[] args) {
	String	str="Apple is a fruit";
	char[] ch=str.toCharArray();
	int count=0;
	for(int i=0; i<ch.length ; i++) {
		
		switch(ch[i])
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
			count++;
		}	
	}
	System.out.println( "the total number of vowels and consonants in a \n" + 
			"string "+count);

	}

}
