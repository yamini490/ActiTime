package stringss;

public class CountUandLCase {

	public static void main(String[] args) {

		String string="HelLO WoRlD";
		char[] ch=string.toCharArray();
		int uCount=0, lCount=0;
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i] <= 'Z')
			{
				uCount++;
			}
			else if(ch[i]>='a' && ch[i] <= 'z')
			{
				lCount++;
			}
			
		}
		System.out.println(string);
		System.out.println("No of Upper Case :" + uCount);
		System.out.println("No of Lower Case :" + lCount);
		
	}

}
