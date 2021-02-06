package StringPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		String str="Yamini";
		String rev="";
		for(int i=0; i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		System.out.println("Reverse A String : " + rev);
	}

}
