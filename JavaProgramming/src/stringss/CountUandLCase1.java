package stringss;

public class CountUandLCase1 {

	public static void main(String[] args) {

		String str="HelLO WoRlD";
		int uCount=0, lCount=0;
		
		for(char ch : str)
		{
			if(ch >= 'A' && ch <= 'Z')
			{
				uCount++;	
			}
			else if (ch>='a' && ch<='z')
			{
				lCount++;
			}
		}

	}

}
