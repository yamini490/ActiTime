package javaStringPrograms;

/*
 * 6) Java Program to divide a string in 'N' equal parts.
 */
public class JSP6 {

	public static void main(String[] args) {
		String str = "All@The@Best";
		int n = 4;
		String[] strArray = new String[n];
		
		if (str.length() % n != 0) {
			System.out.println("Invalid String : Can't divide a string in 'N' equal parts ");
		} else {
			int i=0;
			
while(i<str.length()-1)
{
	for(int k=0; k<strArray.length; k++) {
	String equalParts=str.substring(i, i=i+(n-1));
		strArray[k]=equalParts;	
	}
}
		System.out.println("------------------------------------------------------");	
		for(int j=0 ; j<strArray.length; j++)
		{
			System.out.println(strArray[j]);
		}
				
		System.out.println(strArray.length);
		}

	}

}
