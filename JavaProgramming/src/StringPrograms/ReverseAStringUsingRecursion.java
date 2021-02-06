package StringPrograms;

public class ReverseAStringUsingRecursion {
	
	public static String rev(String str)
	{
		//str.isEmpty()
		if(str.length()==1)
		{
			return str;
		}
			
	 return rev(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
	String	str=rev("SekarKomalaPoojaSwetha");
	System.out.println(str);

	}
//9,
}
