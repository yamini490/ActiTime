package stringss;

public class ConvrtUCtoLC {

	public static void main(String[] args) {
		String str="HelLo WeLcOMe To HoMe";
		// it as UpperCase
		//it as LowerCase
		//it as Space
		char[] ch=str.toCharArray();
		String res="";
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<= 'Z') {
				//For Upper Case
				res=res +(char)(ch[i]+32);
			}
			else if (ch[i]>='a'&& ch[i]<='z')
			{
				//For Lower Case
				res=res +(char)(ch[i]-32);
			}
			else
			{
				//for Space
				res=res+ch[i];
			}
		}
		
System.out.println(str);
System.out.println(res);
	}

}
 