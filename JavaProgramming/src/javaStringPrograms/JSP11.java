package javaStringPrograms;

public class JSP11 {

	public static void main(String[] args) {
		String str="StaY Positive!!"; //String str1="StaY Positive!!";    
		//StringBuilder newStr=new StringBuilder(str);
		StringBuffer newStr=new StringBuffer(str); // StringBuffer newStr=new StringBuffer(str1);  
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isLowerCase(newStr.charAt(i)))
			{
				newStr.setCharAt(i, Character.toUpperCase(newStr.charAt(i)));    	
			}
			else if(Character.isUpperCase(str.charAt(i)));	
			{
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));  		
			}
		}
		 
		System.out.println(newStr);

	}

}
