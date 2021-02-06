package StringPrograms;
// write a program to reverse first half separately and 2nd second half separately 
public class P3 {

	public static void main(String[] args) {
		String str="FunBun";
		String str1=str.substring(0, (str.length()/2));
		str1=rev(str1);
		String str2=str.substring(str.length()/2, str.length());
		str2=rev(str2);
		str1=str1+str2;
		System.out.println(str1);

	}
public static String rev(String str)
{
	String rev="";
	for(int i=0; i<str.length();i++)
	{
		rev=str.charAt(i)+rev;
	}
	return rev;
}

}